import java.util.ArrayList;
import java.util.HashMap;

import javax.naming.directory.InvalidAttributeValueException;

/**
 * Commands_list
 */
public class Commands_list {
    private HashMap<String,ArrayList<String>> commands;
    private HashMap<String,ArrayList<animalClass>> pets;
    
    public Commands_list() {
        this.commands = new HashMap<String,ArrayList<String>>();
        this.pets = new HashMap<String,ArrayList<animalClass>>();
        for (String breed : 
        new String[]{"cat","dog","hamster","horse","camel","donkey"}) {
            this.commands.put(breed, new ArrayList<String>());
            for (String iterable_element : new String[]{"sit","stay","serve"}) {
                this.commands.get(breed).add(iterable_element);
                
            }
            this.pets.put(breed, new ArrayList<animalClass>());
        }

    
    }
    public void addPet(String command_to_parse) throws InvalidAttributeValueException{
        if (command_to_parse == null){
            throw new NullPointerException("null не пройдёт");
        }
        Integer expectedLength=6;
        String buffer = command_to_parse.toLowerCase();
        String[] splitline = buffer.split(" ");
        if (splitline.length!=expectedLength){
            throw new InvalidAttributeValueException("аргументы разделённые пробелом:\n"
            + String.join(" ",
            "тип_животного", "где_живёт","порода_животного",
            "eда_животного", "имя_животного",
            "год_рождения_ИЛИ_сколько_переносит_веса"));
        };
        if (!this.commands.containsKey(splitline[0])){
            throw new UnsupportedOperationException("Таких не держим");

        }
        animalClass temp_pet =null;
        switch (splitline[0]) {
            case "cat":
                System.out.println("new cat");
                temp_pet = new Cat(splitline[1],splitline[2],splitline[3],splitline[4],Integer.valueOf(splitline[5]));
                break;
            case "dog":
                System.out.println("new dog");
                temp_pet = new Dog(splitline[1],splitline[2],splitline[3],splitline[4],Integer.valueOf(splitline[5]));
                break;
            case "hamster":
                System.out.println("new hamster");
                temp_pet = new Hamster(splitline[1],splitline[2],splitline[3],splitline[4],Integer.valueOf(splitline[5]));
                break;
            case "horse":
                System.out.println("new horse");
                temp_pet = new Horse(splitline[1],splitline[2],splitline[3],splitline[4],Integer.valueOf(splitline[5]));
                break;
            case "camel":
                System.out.println("new camel");
                temp_pet = new Camel(splitline[1],splitline[2],splitline[3],splitline[4],Integer.valueOf(splitline[5]));
                break;
            case "donkey":
                System.out.println("new donkey");
                temp_pet = new Donkey(splitline[1],splitline[2],splitline[3],splitline[4],Integer.valueOf(splitline[5]));
                break;
            default:
                break;
        }
        for (int i = 0; i < this.pets.get(splitline[0]).size(); i++) {
            if (temp_pet.equals(this.pets.get(splitline[0]).get(i))){
                throw new InvalidAttributeValueException("Такой питомец уже есть");
            }            
        }

        this.pets.get(splitline[0]).add(temp_pet);
        System.out.println("success!");
        
    }

    public void addCommand(String command_to_parse) throws InvalidAttributeValueException{
        if (command_to_parse == null){
            throw new NullPointerException("null не пройдёт");
        }
        Integer expectedLength=2;
        String buffer = command_to_parse.toLowerCase();
        String[] splitline = buffer.split(" ");
        if (splitline.length!=expectedLength){
            throw new InvalidAttributeValueException("два аргумента разделённые пробелом: "
            + "тип_животного новая_команда");
        };
        if (!this.commands.containsKey(splitline[0])){
            throw new UnsupportedOperationException("Таких не держим");

        }
        if (this.commands.get(splitline[0]).contains(splitline[1])){
            throw new InvalidAttributeValueException("Такая команда уже есть");
        }

        this.commands.get(splitline[0]).add(splitline[1]);
        System.out.println("success!");
        
    }
    public void yellCommands(){
        
        for (String key_ : this.commands.keySet()) {
            System.out.println();
            System.out.print(key_+":");
            for (String command : this.commands.get(key_)) {
                System.out.print(" "+ command);
                
            }
                
            }
            System.out.println();
        }
    public void yellPets(){

        for (String key_ : this.pets.keySet()) {
            System.out.println();
            System.out.print(key_+":");
            for (animalClass unit : this.pets.get(key_)) {
                System.out.print("\n\t"+ unit+"\n");
                
            }
                
            }
            System.out.println();
        }
    
    public static void main(String[] args) {
        Commands_list a = new Commands_list();
        a.yellCommands();
        try{
            a.addCommand("horse ride");
            a.addCommand("asd sda");
        }
        catch (Exception e){
            System.out.println( e.getLocalizedMessage());
        }
        a.yellCommands();

    }
}
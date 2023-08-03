import java.util.Scanner;

/**
 * ui
 */
public class ui {
    String menu_main = String.join("\n",
            "1: add pet",
            "2: commands menu",
            "0: exit");
    
    String menu_commands = String.join("\n",
            "1: commands list",
                        "2: add new command",
                        "0: back to main menu"

            );
    String menu_pets = String.join("\n",
            "1: pets list",
                        "2: add new pet",
                        "0: back to main menu"

            );
    Commands_list base;

    private Scanner main_scanner = new Scanner( System.in);
    
public ui() {
    this.base = new Commands_list();
} 
    public static void main(String[] args) {
        ui a = new ui();
        a.repl_main();    
        
        
    }
    private void repl_main(){
        String temp = null;
        try{

        while ( true) {
            System.out.println(menu_main);
            temp = main_scanner.nextLine();
            switch (temp) {
                case "1":
                    System.out.println("add pet menu");
                    repl_pets();
                    break;
                case "2":
                    repl_commands();
                    break;
                case "0":
                    System.out.println("Out!");
                    System.exit(0);
            
                default:
                    System.out.println("Can't parse. Repeat?");
            }
        }
    }
    catch (Exception e){
        System.out.println(e.getLocalizedMessage());
        repl_main();
    }

    }
    private void repl_pets(){
        String temp = null;
        String PetsServiceLine = null;
        try{

        while ( true) {
            System.out.println(menu_pets);
            
            temp = main_scanner.nextLine();
            System.out.println();
            switch (temp) {
                case "1":
                    this.base.yellPets();
                    break;
                case "2":
                    System.out.println("Input new pet description");
                    PetsServiceLine = main_scanner.nextLine();
                    this.base.addPet(PetsServiceLine);
                    break;
                case "0":
                    repl_main();
                    break;
                default:
                    System.out.println("Can't parse. Repeat?");
                    break;
            }
        }
    }
    catch (Exception e){
        System.out.println(e.getLocalizedMessage());
        repl_pets();
    }

    }
    private void repl_commands(){
        String temp = null;
        String CommandServiceLine = null;
        try{

        while ( true) {
            System.out.println(menu_commands);
            
            temp = main_scanner.nextLine();
            System.out.println();
            switch (temp) {
                case "1":
                    this.base.yellCommands();
                    break;
                case "2":
                    System.out.println("Input pet type and new command");
                    CommandServiceLine = main_scanner.nextLine();
                    this.base.addCommand(CommandServiceLine);
                    break;
                case "0":
                    repl_main();
                    break;
                default:
                    System.out.println("Can't parse. Repeat?");
            }
        }
    }
    catch (Exception e){
        System.out.println(e.getLocalizedMessage());
        repl_commands();
    }

    }
}
/**
 * labor_pets
 */
/**
 * labor_pets
 */
public class labor_pets {

    public static void main(String[] args) {
        Horse a = new Horse("a","a","a","a",2);
        Camel b = new Camel("a","a","a","a",2);
        Horse c = new Horse("a","a","a","a",2);
        Horse d = new Horse("a","a","a","a",3);
        System.out.println("eq");
        System.out.println(a.equals(c));
        System.out.println( "uneq");
        System.out.println(a.equals(b));

    }
}
class Horse extends animalLaborForce{

    public Horse(String area, String breed, String food, String name, Integer carryWeight){
        super(area,breed,food,name,carryWeight);
    }
    @Override
    public void serve(){
        System.out.println(String.join(" ",super.getBreed(),super.getName(), " скачет на радость зевакам."));
    }

    @Override
    public boolean equals(Object otherHorse){
        if (!(otherHorse instanceof Horse)){
            return false;
        }
        return super.equals(otherHorse);
    }
    
}
class Camel extends animalLaborForce{
    public Camel(String area, String breed, String food, String name, Integer carryWeight){
        super(area,breed,food,name,carryWeight);
    }
    @Override
    public void stay(){
        System.out.println(String.join(" ",super.getBreed(),super.getName(), "сливается с ландшафтом"));
    }
    @Override
    public boolean equals(Object otherCamel){
        if (!(otherCamel instanceof Camel)){
            return false;
        }
        return super.equals(otherCamel);
    }
}

class Donkey extends animalLaborForce{
    public Donkey(String area, String breed, String food, String name, Integer carryWeight){
        super(area,breed,food,name,carryWeight);
    }
    public void sit(){
        System.out.println(String.join(" ",super.getBreed(),super.getName(),
        "уже второй день выбирает из двух стогов овса."));
    }

    @Override
    public boolean equals(Object otherDonkey){
        if (!(otherDonkey instanceof Donkey)){
            return false;
        }
        return super.equals(otherDonkey);
    }

}
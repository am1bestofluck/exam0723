/**
 * labor_pets
 */
class Horse extends animalLaborForce{

    public Horse(String area, String breed, String food, String name, Integer carryWeight){
        super(area,breed,food,name,carryWeight);
    }
    @Override
    public void serve(){
        System.out.println(String.join(" ",super.getBreed(),super.getName(), " скачет на радость зевакам."));
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
}

class Donkey extends animalLaborForce{
    public Donkey(String area, String breed, String food, String name, Integer carryWeight){
        super(area,breed,food,name,carryWeight);
    }
    public void sit(){
        System.out.println(String.join(" ",super.getBreed(),super.getName(),
        "уже второй день выбирает из двух стогов овса."));
    }

}
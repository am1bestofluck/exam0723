/**
 * domestic_pets
 */
class Cat extends animalDomestic {
        
    public Cat(String area, String breed, String food, String name, Integer birthYear) {
            super(area,breed,food,name,birthYear);
        }
    
    @Override
    public void serve(){
        System.out.println(String.join(" ",super.getBreed(), super.getName(),"перевернул миску с водой и попытался закопать еду"));
    }
    @Override
    public boolean equals(Object )
    
}
class Dog extends animalDomestic {
    public Dog(String area, String breed, String food, String name, Integer birthYear) {
        super(area,breed,food,name,birthYear);
    }
    @Override
    public void sit(){
        System.out.println(String.join(" ",super.getBreed(), super.getName(),"сидит как лорд седьмых кровей."));
    }
}


class Hamster extends animalDomestic{
    public Hamster(String area, String breed, String food, String name, Integer birthYear) {
        super(area,breed,food,name,birthYear);
    }
    @Override
    public void stay(){
        System.out.println(String.join(" ", super.getBreed(), super.getName(), "чувствует себя как дома."));
    }
    
}
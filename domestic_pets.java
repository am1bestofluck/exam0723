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
    public boolean equals(Object otherCat){
        if (!(otherCat instanceof Cat)){
            return false;
        }
        return super.equals(otherCat);
    }
    
}
class Dog extends animalDomestic {
    public Dog(String area, String breed, String food, String name, Integer birthYear) {
        super(area,breed,food,name,birthYear);
    }
    @Override
    public void sit(){
        System.out.println(String.join(" ",super.getBreed(), super.getName(),"сидит как лорд седьмых кровей."));
    }
    @Override
    public boolean equals(Object otherDog){
        if (!(otherDog instanceof Dog)){
            return false;
        }
        return super.equals(otherDog);
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
    @Override
    public boolean equals(Object otherHamster){
        if (!(otherHamster instanceof Hamster)){
            return false;
        }
        return super.equals(otherHamster);
    }
    
}
/**
 * animalClass
 */
public class animalClass {
    private String breed;

    public String getBreed() {
        return breed;
    }

    private String area;

    public String getArea() {
        return area;
    }

    private String food;

    public String getFood() {
        return food;
    }

    private String name;

    public String getName() {
        return name;
    }

    public animalClass(String area, String breed, String food, String name) {
        this.breed = breed;
        this.area = area;
        this.food = food;
        this.name = name;
    }

    public void sit() {
        throw new UnsupportedOperationException("переписать в дочернем классе");
    }

    public void stay() {
        throw new UnsupportedOperationException("переписать в дочернем классе");
    }

    public void serve() {
        throw new UnsupportedOperationException("переписать в дочернем классе");
    }

    @Override
    public boolean equals(Object other_animal){
        if ( !(other_animal instanceof animalClass)){
            return false;
        }
        if (((animalClass)other_animal).getBreed() != this.breed ||
            ((animalClass)other_animal).getName() != this.name ||
            ((animalClass)other_animal).getArea() != this.area ||
            ((animalClass)other_animal).getFood() != this.food){
            return false;
        }
        if (((animalClass)other_animal).getName() != this.name){
            return false;
        }
        if (((animalClass)other_animal).getName() != this.name){
            return false;
        }
        return true;
    }

    @Override
    public String toString(){
        return String.format("%s %s, eats %s, lives in %s.",this.breed,this.name,this.food,this.area);
    }

}
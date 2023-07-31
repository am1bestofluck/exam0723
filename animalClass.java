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

}
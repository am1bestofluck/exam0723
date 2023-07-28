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
    public animalClass() {
        this.breed= null;
        this.area = null;
        this.food = null;
        this.name = null;
    }

    public void sit(){
        throw new UnsupportedOperationException("переписать в дочернем классе");    
    }
    
    public void stay(){
        throw new UnsupportedOperationException("переписать в дочернем классе");
    }
    
    public void serve(){
        throw new UnsupportedOperationException("переписать в дочернем классе");
    }
    

    
}
/**
 * animalLaborForce
 */

public class animalLaborForce  extends animalClass{
    private Integer carryWeight;

    public Integer getCarryWeight() {
        return carryWeight;
    }
    public animalLaborForce(String area, String breed, String food, String name, Integer carryWeight) {
        super(area,breed,food,name);
        this.carryWeight = carryWeight;
    }
    @Override
    public void serve(){
        System.out.println(super.getBreed() +" "+ super.getName()  + " несёт "+ super.getFood() +" оттуда туда и там, довольный, жуёт."
        +"\nА носить никто ничего не будет. Мы не такие.");
    }
    @Override
    public void sit(){

    }
    @Override
    public void stay(){
        
    }
}
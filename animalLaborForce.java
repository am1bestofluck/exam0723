/**
 * animalLaborForce
 */

public class animalLaborForce extends animalClass {
    private Integer carryWeight;

    public Integer getCarryWeight() {
        return carryWeight;
    }

    public animalLaborForce(String area, String breed, String food, String name, Integer carryWeight) {
        super(area, breed, food, name);
        this.carryWeight = carryWeight;
    }

    @Override
    public void serve() {
        System.out.println(super.getBreed() + " " + super.getName() + " несёт " + super.getFood()
                + " оттуда туда и там, довольный, жуёт."
                + "\nА носить никто ничего не будет. Мы не такие.");
    }

    @Override
    public void sit() {
        System.out.println(super.getBreed() + " " + super.getName() + " сидит отсюда и до обеда.");

    }

    @Override
    public void stay() {
        System.out.println(super.getBreed() + " " + super.getName() + ",позёвывая, делает свои дела.");
    }
    @Override
    public String toString(){
        return String.format("%s can carry up to %s kg.",super.toString(),String.valueOf(this.carryWeight));
    }
    public static void main(String[] args) {
        animalLaborForce  bucik = new animalLaborForce("cell", "horse", "wheat", "bucefal", 80);
        bucik.sit(); bucik.stay(); bucik.serve();
        System.out.println(bucik);
    }
    @Override
    public boolean equals(Object other_animaLaborForce){
        if( !(other_animaLaborForce instanceof animalLaborForce)){
            return false;
        }
        if (!this.carryWeight.equals(((animalLaborForce)other_animaLaborForce).getCarryWeight())){
            return false;
        }
        if (!(super.equals((animalClass)other_animaLaborForce))){
            return false;
        }
        
        
        return true;
    }

}
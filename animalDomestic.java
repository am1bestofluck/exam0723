/**
 * animalDomestic
 */
public class animalDomestic extends animalClass {
    private Integer birthYear;

    public Integer getBirthYear() {
        return birthYear;
    }

    public animalDomestic(String area, String breed, String food, String name, Integer birthYear) {

        super(area, breed, food, name);
        this.birthYear = birthYear;
    }

    @Override
    public void sit() {
        System.out.println(String.join(" ", super.getBreed(), super.getName(), "элегантно сидит на попе. Как учили."));
    }

    @Override
    public void stay() {
        System.out.println(String.join(" ", super.getBreed(), super.getName(), "ищет где бы поспать"));

    }

    @Override
    public void serve() {
        System.out.println(String.join(" ", super.getName(), "выпрашивает", super.getFood()));

    }

    public static void main(String[] args) {
        animalDomestic barsik = new animalDomestic("dom", "Kot", "riba", "Barsik", 2005);
        barsik.sit();
        barsik.stay();
        barsik.serve();
    }
}
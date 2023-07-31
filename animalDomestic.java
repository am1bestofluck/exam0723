/**
 * animalDomestic
 */
public class animalDomestic extends animalClass{
    private Integer birthYear;

    public Integer getBirthYear() {
        return birthYear;
    }

    public animalDomestic(String area, String breed, String food, String name, Integer birthYear) {
        
        super(area,breed,food,name);
        this.birthYear = birthYear;
    }
}
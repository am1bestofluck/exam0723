/**
 * counter
 */

public class counter {
    private Integer value = null;

    private static final Integer default_value = 0;

    public Integer getValue() {
        return value;
    }

    public counter() {
        this.value = counter.default_value;
    }
    
    public void increment() throws RoutineViolationException{

        throw new RoutineViolationException("Мы так делать не будем.");
    }
}
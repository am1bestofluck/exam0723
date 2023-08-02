/**
 * за_утомилс_я уже честно говоряяяяяя
 * но раз уж взялся то можно сделать хорошо :\
 * шо вообще такое этот трайвиз. Избавляет нас от необходимости закрывать файл. 
 * Значит надо значение брать из файла, и из-за этого вся малина. Тоска.
 * 
 */

public class Counter {
    private Integer value = null;

    private static final Integer default_value = 0;

    public Integer getValue() {
        return value;
    }

    public Counter() {
        this.value = Counter.default_value;
    }
    public void  add (){
        throw new RoutineViolationException("Ну надо так надо :\\");
    }
    
    public void increment(){
        this.value ++;
        
    }
}
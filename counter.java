import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * за_утомилс_я уже честно говоряяяяяя
 * но раз уж взялся то можно сделать хорошо :\
 * шо вообще такое этот трайвиз. Избавляет нас от необходимости закрывать файл. 
 * Значит надо значение брать из файла, и из-за этого вся малина. Тоска.
 * 
 */

public class Counter implements AutoCloseable {
    private Integer value = null;
    private File source =  new File("source.txt");
    Scanner reader;
    PrintWriter writer;
    private boolean power_on = false;



    private static final Integer default_value = 0;

    public Integer getValue() {
        return value;
    }

    public Counter() {
        try {
            this.reader = new Scanner(source);
        
            this.value = Integer.valueOf(reader.nextLine());
        }
        catch (Exception e){
            this.value = default_value;
        }
        try{
        this.writer = new PrintWriter(source);
        }
        catch (Exception e ){
            System.out.println( e);
        }
        this.power_on = true;
    }

    public void  add (){
        throw new RoutineViolationException("Ну надо так надо :\\");
    }
    
    public void increment(){
        if (this.power_on == false){
            throw new RoutineViolationException("После закрытия никто ничего не добавляет");

        }
        this.value++;
        System.out.println( String.format("Текущее значение счётчика: %d ",this.value));
        this.writer.println(this.value);
        
    }

    @Override
    public void close() throws Exception {
        if (this.reader!= null){

        this.reader.close();}
        this.writer.close();
        this.power_on = false;
        
    }
    public static void main(String[] args) {
        try(Counter a = new Counter()){
            a.increment();
        }
    
    catch (Exception e ){
        System.out.println( e.getLocalizedMessage());
    }
}
}
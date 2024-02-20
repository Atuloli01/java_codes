//write a java program to print time
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
class Demo{
    public void printTime(){
        LocalDateTime t=LocalDateTime.now();
        DateTimeFormatter f=DateTimeFormatter.ofPattern("hh/mm/ss");
        System.out.println(f.format(t));
    }
}
public class _72PrintTime {
    public static void main(String []args){
        Demo obj=new Demo();
        obj.printTime();
    }
}

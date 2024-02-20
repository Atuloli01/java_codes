//write a java program to print currrent data (Assisngment 11)
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
class Test5{
    public static void printDate(){
        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(f.format(now));
    }
}
public class _71PrintDate {
    public static void main(String []args){
        Test obj=new Test();
        obj.printDate();
    }
}

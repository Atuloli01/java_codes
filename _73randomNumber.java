//wrtie a jaa program to print random number between 100 to 200;
import java.lang.Math;
class Demo1{
    public void printRandom(){
        double d1=Math.random()*100+100;
        System.out.println((int)d1);
    }
}
public class _73randomNumber {
    public static void main(String []args){
        Demo1 obj=new Demo1();
        obj.printRandom();
    }
}

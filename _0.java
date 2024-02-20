// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.lang.Runnable;

class A implements Runnable{
    public void run(){
        f1();
    }
    public void f1(){
        for(int i=0;i<=10;i++){
            System.out.println("i :"+i);
        }
    }
}
class B implements Runnable{
public void run(){
    f2();
}
public void f2(){
    for(int j=0;j<=10;j++){
        System.out.println("j: "+j);
    }
}
    
}
public class _0{
    
    public static void main(String[] args) {
        A obj=new A();
        B obj1=new B();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1);
        t1.start();
        t2.start();
    }
}
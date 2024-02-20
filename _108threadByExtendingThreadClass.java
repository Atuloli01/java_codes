
class A extends Thread{
    public void run(){
        f1();
    }
    public void f1(){
        for(int i=0;i<=10;i++){
            System.out.println("i="+i);
        }                                  
    }
}
class B extends Thread{
    public void run(){
        f2();
    }
    public void f2(){
        for(int j=0;j<=10;j++){
            System.out.println("j="+j);
        }
    }
}

public class _108threadByExtendingThreadClass{
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();
        obj1.start();
        obj2.start();
    }
}

//isme sirf threadingThroughRunnableInterface with the help of ananymous class kiya h->

public class _109usefulFunctionThread {
    public static void main(String[] args) {
        //using ananoyms class 
        Thread t1=new Thread(new Runnable(){// yaha runnable matlab runnable interface ko implement karna h
            public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("i="+i);
        }
    }
        });
        Thread t2=new Thread(new Runnable(){
            public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("i="+i);
        }
    }
   
        });
         t1.start();
        t2.start();
    }
}

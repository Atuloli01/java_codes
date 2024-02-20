// jaise is code mein meth1() ko meth2() call karra h or meth2() ko meth3 call karra h to es case mein hum try-catch ya to meth1() me ya meth2() me ya meth3() mein use karenge;
public class _102ABariThrowThrows {
   static int meth1(){
    return 10/0;
   } 
   static void meth2(){
    meth1();  
   }
   static void meth3(){
    meth2();
   }
   public static void main(String[] args) {
    try{
    meth3();
    }
    catch(Exception e){
        System.out.println(e); 
    }
   }
}

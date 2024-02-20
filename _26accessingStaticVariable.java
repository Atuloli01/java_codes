
    class demo1{
    int a=9,b=46;
    static int k=-56;
}
public class _26accessingStaticVariable {
    public static void main(String []args){
        demo1 obj1=new demo1();
        demo1 obj2=new demo1();

        System.out.println("A="+obj1.a+"B="+obj1.b);
        System.out.println("A="+obj2.a+"B="+obj2.b);
        System.out.println("k="+demo1.k);


    }
}

//write a java program to calculate root of quadratic equation
class Demo3{
    public void calculateRoot(int a,int b,int c){
        double firstRoot,secondRoot;
        firstRoot=(-b+Math.sqrt(b*b-4*a*c))/2*a;
        secondRoot=(-b-Math.sqrt(b*b-4*a*c))/2*a;
    System.out.println("Roots of equation are :"+(int)firstRoot+" "+(int)secondRoot);
    }
}
public class _74calculateRoot {
    public static void main(String []args){
        Demo3 obj=new Demo3();
        obj.calculateRoot(1,-8,5);

    }
}

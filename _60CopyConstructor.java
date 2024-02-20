import java.util.Scanner;
class CopyConstructor{
    private String name;
    private int age;
    public CopyConstructor(String name,int age){
        this.name=name;
        this.age=age;
    }
    public CopyConstructor(CopyConstructor c){
        this.name=c.name;
        this.age=c.age;
    }
    public void displayData(){
        System.out.println("Name: "+this.name);
        System.out.println("Age : "+this.age);
    }
}
public class _60CopyConstructor{
    public static void main(String []args){
        CopyConstructor c1=new CopyConstructor("Lalit",19);
        CopyConstructor c2=new CopyConstructor(c1);
        c1.displayData();
        c2.displayData();
    }
}
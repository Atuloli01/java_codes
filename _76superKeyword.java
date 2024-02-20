class Test{
    int maxSpeed=120;
}
class Car extends Test{
    int maxSpeed=180;
    void display(){
        System.out.println("Maximum speed:"+super.maxSpeed);
    }
}
public class _76superKeyword {
    public static void main(String []args){
        Car obj=new Car();
        obj.display();
    }
}

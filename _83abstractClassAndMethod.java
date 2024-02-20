
abstract class Vechile{
    abstract void bike();
    void car(){
        System.out.println("Car is runnin g");
    }
}
class Honda extends Vechile{
    void bike(){
        System.out.println("Bike is running");
    }
}
public class _83abstractClassAndMethod {
    public static void main(String[] args) {
        Honda obj=new Honda();
        obj.bike();
        obj.car();
    }
}

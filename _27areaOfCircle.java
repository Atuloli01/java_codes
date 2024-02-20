class example{
    private int radius=5;
    float area(){
         return 3.14f*radius*radius;
    }
}
public class _27areaOfCircle {
    public static void main(String []args){
        example obj=new example();
        System.out.println("Area of circle is "+obj.area());
    }
}

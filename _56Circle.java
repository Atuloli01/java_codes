class Circle{
    private int radius;
    public void setRadius(int r){
        radius=r;
    }
    public float areaOfCircle(){
        return 3.14f*radius*radius;
    }

    public float circumferenceOfCircle(){
        return 2*3.14f*radius;
    }
}
public class _56Circle{
    public static void main(String []args){
        Circle obj=new Circle();
        obj.setRadius(2);
        System.out.println("Area of circle is : "+obj.areaOfCircle());
        System.out.println("Circumference of circle is : "+obj.circumferenceOfCircle());
    }
}
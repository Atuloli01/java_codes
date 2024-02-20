interface Area{
    double PI=3.14;
    double getArea();
}
public class _84interface implements Area {
    private double radius;
    public void setRadius(double radius){
        this.radius=radius;
    }
    public void getRadius(){
        System.out.println("Radius is :"+radius);
    }
    public double getArea(){
        return PI*radius*radius;
    }
    public static void main(String []args){
        _84interface obj=new _84interface();
        obj.setRadius(4.56);
        obj.getRadius();
        System.out.println("Area of circle is :"+obj.getArea());
    }
}

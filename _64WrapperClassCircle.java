import java.sql.SQLOutput;

class Circle1{
    private Integer radius;

    public void setRadius(Integer r) {
        radius = r;
    }
    public Integer getRadius() {
        return radius;
    }


    public Double getArea(){
        return 3.14*radius*radius;
    }

    public Double getCircumference(){
        return 2*3.14*radius;
    }
}

public class _64WrapperClassCircle {
    public static void main(String []args){
    Circle1 obj=new Circle1();
    obj.setRadius(5);
    System.out.println("Value of radius is : "+obj.getRadius());
    System.out.println("Value of Area of Circle is : "+obj.getArea() );
    System.out.println("Value of circumfarence of circle is : "+obj.getCircumference());

}}

class Person{
    private String name;
    private int age;
    public void setName(String n){
        name=n;
    }
    public void setAge(int a){
        age=a;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
class Employee1 extends Person{
    private double salary;
    public void setSalary(double s){
        salary=s;
    }
    public double getSalary(){
        return salary;
    }
}
public class _70InheritanceExample {
    public static void main(String []args){
        Employee1 obj=new Employee1();
        obj.setName("Lalit");
        obj.setAge(19);
        obj.setSalary(49999.99);
        System.out.println("Name is : "+obj.getName());
        System.out.println("Age is : "+ obj.getAge());
        System.out.println("Salary is : "+ obj.getSalary());
    }
}

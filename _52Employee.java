class Employee{
    private int empid;
    private String name;
    private float salary;

    public void setEmpid(int id) {
        empid = id;
    }

    public void setName(String n) {
        name = n;
    }

    public void setSalary(float sal) {
        salary = sal;
    }

    public int getEmpid() {
        return empid;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }
}
public class _52Employee{
    public static void main(String []args){
        Employee obj=new Employee();
        obj.setEmpid(01);
        obj.setName("Lalit");
        obj.setSalary(50000.23f);

        System.out.println("Employee Id is :" +obj.getEmpid());
        System.out.println("Name of Employee is :" +obj.getName());
        System.out.println("Employee Salary :" +obj.getSalary());

    }
}
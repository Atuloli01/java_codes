class Course{
    private int courseId;
    private String courseName,duration;
    private double fees;

    public void setCourseId(int id) {
        courseId = id;
    }

    public void setCourseName(String name) {
        courseName = name;
    }

    public void setDuration(String time) {
        duration = time;
    }

    public void setFees(double paisa) {
        fees = paisa;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDuration() {
        return duration;
    }

    public double getFees() {
        return fees;
    }
}
public class _55Course{
    public static void main(String []args){
        Course obj=new Course();
        obj.setCourseId(01);
        obj.setCourseName("BCA");
        obj.setDuration("3 years");
        obj.setFees(75000.01);

        System.out.println("Course id is : "+obj.getCourseId());
        System.out.println("Course Name is : "+obj.getCourseName());
        System.out.println("Course Duration is : "+obj.getDuration());
        System.out.println("Course Fees is : "+obj.getFees());

    }
}

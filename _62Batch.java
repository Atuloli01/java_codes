import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
class Batch{
    private int batchCode,studentCount,totalNumberOfBatches;
    private String course,days;
    private LocalDateTime startDate,time;

    public void setBatchCode(int batchCode) {
        this.batchCode = batchCode;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public void setTotalNumberOfBatches(int totalNumberOfBatches) {
        this.totalNumberOfBatches = totalNumberOfBatches;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
    //getters

    public int getBatchCode() {
        return batchCode;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public int getTotalNumberOfBatches() {
        return totalNumberOfBatches;
    }

    public String getCourse() {
        return course;
    }

    public String getDays() {
        return days;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
public class _62Batch{
    public static void main(String []args){
        Batch obj=new Batch();
        obj.setBatchCode(01);
        obj.setCourse("BCA");
        LocalDateTime startDate=LocalDateTime.of(2004,8,7,0,0);
        obj.setStudentCount(350);
        LocalDateTime setTime=LocalDateTime.of(0,1,1,15,6);
        obj.setDays("3 Days");
        obj.setTotalNumberOfBatches(4);
        System.out.println("Batch Code :"+obj.getBatchCode());
        System.out.println("Course : "+obj.getCourse());
        System.out.println("Local Date Time is : "+obj.getStartDate());
        System.out.println("Student Count is :"+obj.getStudentCount());
        System.out.println("Time : "+obj.getTime());
        System.out.println("Days is :"+obj.getDays());
        System.out.println("Total Number of Batches : "+obj.getTotalNumberOfBatches());

    }
}
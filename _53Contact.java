class Contact{
    private int fieldsId;
    String mobileNO;
    private String firstName,lastName,emailId;
    public void setFieldsId(int f){
        fieldsId=f;
    }
    public void setFirstName(String s1){
        firstName=s1;
    }
    public void setLastName(String s2){
        lastName=s2;
    }
    public void setMobileNO(String no){
        mobileNO=no;
    }
    public void setEmailId(String s3){
        emailId=s3;
    }

    public int getFieldsId() {
        return fieldsId;
    }

    public String getMobileNO() {
        return mobileNO;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailId() {
        return emailId;
    }
}
public class _53Contact{
    public static void main(String []args){
        Contact obj=new Contact();
        obj.setFieldsId(01);
        obj.setFirstName("Lailt");
        obj.setLastName("Bhatt");
        obj.setMobileNO("9412137584");
        obj.setEmailId("lb181808@gmail.com");
        System.out.println("Id is : "+obj.getFieldsId());
        System.out.println("First Name is :"+obj.getFirstName());
        System.out.println("Last Name is : "+obj.getLastName());
        System.out.println("Last Name is : "+obj.getMobileNO());
        System.out.println("Email id is : "+obj.getEmailId());
    }

        }
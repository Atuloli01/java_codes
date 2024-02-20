import java.sql.SQLOutput;

class Marksheet{
    private Integer physics,mathematics,chemistry,hindi,english;
    public Boolean PassOrFail(Integer PassingMarks){
        Boolean bool=true;
        if(mathematics<PassingMarks){
            return false;
        }
        if(hindi<PassingMarks){
            return false;
        }
        if(english<PassingMarks){
            return false;
        }
        if(physics<PassingMarks){
            return false;
        }
        if(chemistry<PassingMarks){
            return false;
        }
        return bool;
    }
    public Float averageMarks(){
        return (float)(english+hindi+physics+chemistry+mathematics)/5;
    }

    public Integer maximumMarks(){
        Integer max=0;
        if(max<hindi){
            max=hindi;
        }
        if(max<english){
            max=english;
        }
        if(max<chemistry){
            max=chemistry;
        }
        if(max<physics){
            max=physics;
        }
        if(max<mathematics){
            max=mathematics;
        }
        return max;
    }
    public Integer getPhysics() {
        return physics;
    }

    public void setPhysics(Integer physics) {
        this.physics = physics;
    }

    public Integer getMathematics() {
        return mathematics;
    }

    public void setMathematics(Integer mathematics) {
        this.mathematics = mathematics;
    }

    public Integer getChemistry() {
        return chemistry;
    }

    public void setChemistry(Integer chemistry) {
        this.chemistry = chemistry;
    }

    public Integer getHindi() {
        return hindi;
    }

    public void setHindi(Integer hindi) {
        this.hindi = hindi;
    }

    public Integer getEnglish() {
        return english;
    }

    public void setEnglish(Integer english) {
        this.english = english;
    }
}
public class _65WrapperClassMarksheet {
    public static void main(String []args){
        Marksheet obj=new Marksheet();
        obj.setPhysics(92);
        obj.setChemistry(56);
        obj.setEnglish(47);
        obj.setHindi(32);
        obj.setMathematics(98);
        System.out.println("Hindi="+obj.getHindi());
        System.out.println("English="+obj.getEnglish());
        System.out.println("Physics="+obj.getPhysics());
        System.out.println("Chemistry="+obj.getChemistry());
        System.out.println("Mathematics="+obj.getMathematics());
        System.out.println("Maximum marks are : "+obj.maximumMarks());
        System.out.println("Average of all Subjects is : "+obj.averageMarks());
        System.out.println("Is he pass in all subjects? ="+obj.PassOrFail(33));
    }
}

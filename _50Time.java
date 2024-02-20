class Time{
    public int hour,minute,second;
    public void setValue(int hr,int min,int sec){
        hour=hr;
        minute=min;
        second=sec;
    }
    public void showValue(){
        if(second>60){
            minute++;
            second=second-60;
        }
        if(minute>60){
            hour++;
            minute=minute-60;
        }
        System.out.println(hour+"hour"+minute+"minute"+second+"second");
    }
        }
        public class _50Time{
        public static void main(String []args){
            Time obj=new Time();
            obj.setValue(2,72,80);
            obj.showValue();
        }
        }
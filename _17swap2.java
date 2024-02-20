public class _17swap2{
    public static void main(String []args){
        int num1=5;
        int num2=7;
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("Value of first Variable after swapping : "+num1);
        System.out.println("Value of second variable after swapping : "+num2);

    }
}
public class _21sumOfDigits{
    public static void main(String []args){
        int number=3453;
        number=(number%10)+(number/10%10)+(number/100%10)+(number/1000%10);
        System.out.println("Sum of all digits are "+number);
    }
}
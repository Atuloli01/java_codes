public class _22reverseNumber{
    public static void main(String []args){
        // this code will work only for three digit number
        int num=583;
        num=(num%10*100)+(num/10%10*10)+(num/100%10*1);
        System.out.println("Reversed number is "+num);
    }
}
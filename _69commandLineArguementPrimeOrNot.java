//write a java program to check wheaterh the given number provided through command line arguement is prime or not
public class _69commandLineArguementPrimeOrNot {
    public static void main(String []args){
        int count=0;
        int number=Integer.parseInt(args[0]);
        for(int i=1;i<number;i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number is not a prime number");
        }
    }
}

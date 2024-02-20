import java.util.Scanner;
public class _48userInput{
    public static void main(String []args){
        System.out.println("Enter your name and age:");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();

        System.out.println("Name is :"+name);
        System.out.println("Age is :"+age);
    }
}
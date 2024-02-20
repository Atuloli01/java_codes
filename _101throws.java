import java.util.Scanner;
class SavingsAccount{
    private int accountNumber;
    private double balance;

    public SavingsAccount(int ano,double balance){
        accountNumber=ano;
        this.balance=balance;
    }
    public void addMoney(double amt){
        balance=balance+amt;
    }
    public void withdraw(double amt)throws InsufficientBalance { 
        if(balance<amt){
            throw new InsufficientBalance("Insufficient Balance");
        }
        balance=balance-amt;
    }
    public void showBalance(){
        System.out.println("Current Balance is : "+balance);
    }
}
class InsufficientBalance extends Exception{
    public InsufficientBalance(String s){
        super(s);
    }
}
public class _101throws {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    SavingsAccount obj=new SavingsAccount(100, 5000.00);
    obj.showBalance();
    System.out.println("Enter amount to withdraw");
    // try{
        obj.withdraw(sc.nextDouble());
    //}
    // catch(//InsufficientBalance e){
    //     System.out.println(e.getMessage());
    // }
    obj.showBalance();

    
}}


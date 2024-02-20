class Account{
    private String accountNumber,customerName;
    private double balance;
    private static float rateOfInterest;

    public void setAccountNumber(String number){
        accountNumber=number;
    }
    public void setCustomerName(String name){
        customerName=name;
    }
    public void setBalance(double bal){
        balance=bal;
    }

    public static void setRateOfInterest(float rate){
        Account.rateOfInterest=rate;
    }
    //getters
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getCustomerName(){
        return customerName;
    }
    public double getBalance(){
        return balance;
    }
    public double getSimpleIntrest(int t){
        int time;
        time=t;
        return (balance*rateOfInterest*time)/100;
    }
    public float getRateOfInterest(){
        return rateOfInterest;
    }
}

public class _58Account{
    public static void main(String []args){
        Account obj=new Account();
        obj.setAccountNumber("41534815398");
        obj.setCustomerName("Lalit Bhatt");
        obj.setBalance(49678.97);
        obj.setRateOfInterest(4.5f);

        System.out.println("Account Number is : "+obj.getAccountNumber());
        System.out.println("Customer Name is : "+obj.getCustomerName());
        System.out.println("Balance in Account is : "+obj.getBalance());
        System.out.println("Rate of Intrest is : "+obj.getRateOfInterest());
        System.out.println("Simple Intrest is : "+obj.getSimpleIntrest(3));

    }
}
public class _8passangerTicketPrice{
    public static void main(String []args){
        char passanger='f';
        char age=37;
        if(passanger=='m'){
            if(age>50)
            {
                System.out.println("Ticket price is : 10");
            }
            else
            {
                System.out.println("Ticket price is : 20");
            }
        }
        else{
            if(age<30)
            {
                System.out.println("Ticket price is : 50");
            }
            else
            {
                System.out.println("Ticket price is : 40");
            }
        }
    }
}
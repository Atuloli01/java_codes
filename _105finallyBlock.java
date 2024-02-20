public class _105finallyBlock {
    public static void main(String[] args) throws Exception {
        try{
        System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
        System.out.println("Final Message");
        }
    }

}

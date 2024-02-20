//Write a java program to add N numbers.Numbers are provided throgugh command line;
public class _67commandLineArguementAddnNumbers {
    public static void main(String []args){
         int sum=0;
         for(int i=0;i<args.length;i++){
             sum=sum+Integer.parseInt(args[i]);
         }
         System.out.println("sum is : "+sum);
    }
}

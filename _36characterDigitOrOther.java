public class _36characterDigitOrOther {
    public static void main(String []args){
        char ch=7;
        if(ch>='A' && ch<='Z' ||ch>='a' && ch<='z'){
            System.out.println("Alphabets");
        }
        else if(ch>=0 && ch<=9)
        {
            System.out.println("Digits");
        }
        else
        {
            System.out.println("Other Characters");
        }

    }
}

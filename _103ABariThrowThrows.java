public class _103ABariThrowThrows {
    static int  area(int l,int b) throws Exception{
        if(l<0||b<0){
            throw new Exception();
        }
        return l*b;
    }
    static void meth1() throws Exception{
        try{
        System.out.println("Area is: "+area(-10,5));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws Exception {
        meth1();
    }
}

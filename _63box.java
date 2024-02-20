class Box{
    private int length,breadth,height;
    private static int boxcount;

    void setDimension(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;
    }
    public void showDimension(){
        System.out.println("Length: "+length);
        System.out.println("Breadth : "+breadth);
        System.out.println("Height : "+height);
    }
    public static void boxCount(){
        boxcount++;
        System.out.println("Box Count is : "+boxcount);
    }
}
public class _63box{
    public static void main(String []args){
        Box obj=new Box();
        obj.setDimension(2,4,6);
        obj.showDimension();
        Box.boxCount();
        Box obj1=new Box();
        obj1.setDimension(6,7,8);
        obj1.showDimension();
        Box.boxCount();
    }
}
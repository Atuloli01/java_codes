public class _24object1 {
    int length,breadth,height;
    void setDimension(int x,int y,int z){
        length=x;
        breadth=y;
        height=z;
    }
    void showDimension(){
        System.out.println("length is "+length);
        System.out.println("Breadth is "+breadth);
        System.out.println("Height is "+height);
    }
    public static void main(String []args){
        _24object1 obj=new _24object1();
        obj.setDimension(2,5,4);
        obj.showDimension();
    }
}

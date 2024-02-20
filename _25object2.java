class demo{
    int length,breadth,height;
    void setDimension(int x,int y,int z){
        length=x;
        breadth=y;
        height=z;
    }
    void showDimension(){
        System.out.println("Length is "+length);
        System.out.println("Breadth is "+breadth);
        System.out.println("Height is "+height);
    }
}

public class _25object2 {
    public static void main(String []args){
        demo obj=new demo();
        obj.setDimension(3,6,4);
        obj.showDimension();
    }
}

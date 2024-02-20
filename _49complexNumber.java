class Complex{
    public int real,img;
    public void setValues(int r,int i){
        real=r;
        img=i;
    }
    public void display(){
        System.out.println("Complex Number is : "+real+"+"+"i"+img);
    }
}
public class _49complexNumber{
    public static void main(String []args){
        Complex obj=new Complex();
        obj.setValues(3,5);
        obj.display();
    }
}
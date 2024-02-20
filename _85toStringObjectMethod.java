class demo{
    private int real,imag;
    public void setComplex(int real,int imag){
        this.real=real;
        this.imag=imag;
    }
    public String toString(){
        return real+"+"+imag+"i";
    }
    
}
public class _85toStringObjectMethod {
    public static void main(String []args){
    demo obj=new demo();
    obj.setComplex(3,5);
    System.out.println(obj);
}
}

class test{
    private int real,imag;
    public void setComplex(int real,int imag){
        this.real=real;
        this.imag=imag;
    }
    public boolean equals(test y){
        if(real==y.real && imag==y.imag)
        return true;
        else
        return false;
    }
}
public class _87equalsObjectMethod {
    public static void main(String[] args) {
        test obj=new test();
        test obj1=new test();
        obj.setComplex(2,4);
        obj1.setComplex(2,4);

        System.out.println(obj.equals(obj1));
    }
}

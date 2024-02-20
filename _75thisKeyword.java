public class _75thisKeyword {
    int rollNo;
    String name;
    float fee;
    //parameterised constructor->
    _75thisKeyword(int rollNo,String name,float fee){
        this.rollNo=rollNo;
        this.name=name;
        this.fee=fee;
    }
    void display(){
        System.out.println("roll no is :"+rollNo);
        System.out.println("name is :"+name);
        System.out.println("fee is :"+fee);
    }
    public static void main(String []args){
        _75thisKeyword obj=new _75thisKeyword(01,"Lalit",4567.34f);
        obj.display();
        
    }
}

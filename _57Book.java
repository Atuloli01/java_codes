class Book{
    private int bookId;
    private float price;
    private String author;

    public void setBookId(int id){
        bookId=id;
    }
    public void setPrice(float amount){
        price=amount;
    }

    public void setAuthor(String s){
        author=s;
    }

    public void getBookId(){
        System.out.println("Book Id number is : "+bookId);
    }

    public void getPrice(){
        System.out.println("Price of book is : "+price);
    }

    public void getAuthor(){
        System.out.println("Author of book is : "+author);
    }
}
public class _57Book{
    public static void main(String []args){
        Book obj=new Book();
        obj.setBookId(01);
        obj.setPrice(499.99f);
        obj.setAuthor("Lalit Bhatt");
        obj.getBookId();
        obj.getPrice();
        obj.getAuthor();
    }
}
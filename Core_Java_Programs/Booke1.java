/*constructor chaning example

 */
public class Booke1 {
    String bookname,author;
    int price;
    public Booke1(String bookname,String author)
    {
        this.bookname=bookname;
        this.author=author;
    }
    public Booke1(String bookname,String author,int price)
    {
        this(bookname,author);
        this.price=price;
    }
    void display()
    {
        System.out.println(bookname + " : " +author + " : " +price);
    }
}
class book1{
    public static void main(String[] args) {
        Booke1 b=new Booke1("oracle","richard");
        b.display();
        Booke1 b1=new Booke1("java","alex",250);
        b1.display();
    }
}

/*4 example of copying values without constructor

 */
 public class BookExg {
   String bookname;
   String author;

   public BookExg(String b, String a)
   {
       bookname = b;
       author =a;
   }
   public BookExg()
   {

   }
   void displaydata()
   {
       System.out.println("Bookname = " + bookname);
       System.out.println("author : " + author);
   }
}
class testbook{
    public static void main(String[] arg)
    {
        BookExg b=new BookExg("oracle","richard");
        BookExg b1=new BookExg();
        b1.bookname=b.bookname;
        b1.author=b.author;
        b.displaydata();
        b1.displaydata();

    }
}

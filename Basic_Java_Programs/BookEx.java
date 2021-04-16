/*9 create a class book having fields bookid,bookname,author,price and methods getbookdata and display bookdata

 */
package com.mkpits.java.basicprograms;
import java.util.*;
public class BookEx {
    static class Book{
        int bookid;
        String bookname;
        String author;
        float price;

        void getdata(int i,String n,String a,Float p)
        {
            bookid=i;
            bookname=n;
            author=a;
            price=p;
        }
        void showdata()
        {
            System.out.println("Bookid :" + bookid);
            System.out.println("Book name :" + bookname);
            System.out.println("Book Author :" + author);
            System.out.println("Book price :" +price);
        }
    }
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        Book b1=new Book();
        System.out.println("Enter book id,name,author and price ");
        int i= sc.nextInt();
        String n=sc.next();
        String a=sc.next();
        float p=sc.nextFloat();
        b1.getdata(i,n,a,p);
        b1.showdata();

    }
}

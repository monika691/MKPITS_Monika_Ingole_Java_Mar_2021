/*- create  a hashset collection for book.

 */
package com.mkpits.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Book2{
    int book_id;
    String name,author,publication;
    int qty;
    public Book2(int book_id,String name,String author,String publication,int qty){
        this.book_id=book_id;
        this.name=name;
        this.author=author;
        this.publication=publication;
        this.qty=qty;

    }
}
public class BookHashset {
    public static void main(String[] args) {
        HashSet<Book> bk=new HashSet<Book>();
        Book b1=new Book(12,"c++","Kanetkar","swan",4);
        Book b2=new Book(13,"java","yashwant","mehta",8);
        Book b3=new Book(14,"oracle","Kulkarni","shakti",12);

        bk.add(b1);
        bk.add(b2);
        bk.add(b3);

        for (Book b : bk){
            System.out.println(b.book_id+ ":" + b.name+ ":" + b.author + ":" + b.publication + ":" + b.qty);
        }

    }
}

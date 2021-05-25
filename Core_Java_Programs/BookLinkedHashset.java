/*17 program to create collection of book using linkedhashset.

 */
package com.mkpits.java.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

class Book3{
    int book_id;
    String name,author,publication;
    int qty;
    public Book3(int book_id,String name,String author,String publication,int qty){
        this.book_id=book_id;
        this.name=name;
        this.author=author;
        this.publication=publication;
        this.qty=qty;
    }
}
public class BookLinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<Book> bk=new LinkedHashSet<Book>();
        Book b1=new Book(11,"lords","joshi","swan",34);
        Book b2=new Book(21,"Java","kale","nirmal",30);
        Book b3=new Book(31,"python","lee","mehta",24);

        bk.add(b1);
        bk.add(b2);
        bk.add(b3);

       for (Book b:bk){
           System.out.println(b.book_id+":"+b.name+":"+b.author+":"+b.publication+":"+b.qty);
       }

    }
}

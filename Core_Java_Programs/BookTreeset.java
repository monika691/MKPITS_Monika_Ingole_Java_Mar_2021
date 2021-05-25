/*example to create book collection using treeset class.

 */
package com.mkpits.java.collection;
import java.util.*;
class Book4 implements Comparable<Book4> {
    int id;
    String name,author,publication;
    int qty;
    public Book4(int id,String name,String author,String publication,int qty){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publication=publication;
        this.qty=qty;

    }

    @Override
    public int compareTo(Book4 o) {
        if(id> o.id){
            return 1;
        }else if(id<o.id){
            return -1;
        }else {
        return 0;
    }
}
}
public class BookTreeset {
    public static void main(String[] args) {
        Set<Book4> bk =new TreeSet<Book4>();
        Book4 b1 = new Book4(12, "c++", "Kanetkar", "swan", 4);
        Book4 b2 = new Book4(13, "java", "yashwant", "mehta", 8);
        Book4 b3 = new Book4(14, "oracle", "Kulkarni", "shakti", 12);

        bk.add(b1);
        bk.add(b2);
        bk.add(b3);

        for (Book4 b : bk) {
            System.out.println(b.id + ":" + b.name + ":" + b.author + ":" + b.publication + ":" + b.qty);

        }
    }
}
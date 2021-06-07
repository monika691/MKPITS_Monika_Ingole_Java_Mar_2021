/*create a key value collection of book using hashtable class

 */
package com.mkpits.java.collection3;

import java.util.Hashtable;
import java.util.Map;

class Book{
    int id;
    String name,author;
    int qty;
    public Book(int id,String name,String author,int qty){
        this.id=id;
        this.name=name;
        this.author=author;
        this.qty=qty;
    }
}
public class BookHashTableEx {
    public static void main(String[] args) {
        Hashtable<Integer,Book> ht=new Hashtable<Integer,Book>();
        Book b1=new Book(121 ,"Rajesh","kale",23);
        Book b2=new Book(122,"Arun","joshi",25);
        Book b3=new Book(123,"Mangesh","pande",27);

        ht.put(1,b1);
        ht.put(2,b2);
        ht.put(3,b3);

        for (Map.Entry <Integer,Book>b: ht.entrySet()){
            int key=b.getKey();
            Book bk=b.getValue();
            System.out.println(key + "details : ");
            System.out.println(bk.id + " " + bk.name + " " + bk.author + " " + bk.qty);
        }

    }
}

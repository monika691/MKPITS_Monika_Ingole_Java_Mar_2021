/*2- program to create collection of products using priority quee class

 */
package com.mkpits.java.collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

class Product implements Comparable<Product> {
    int id;
    String productname;
    int price;

    public Product(int id, String productname, int price) {
        this.id = id;
        this.productname = productname;
        this.price = price;
    }

    public int compareTo(Product p) {
        if (id > p.id) {
            return 1;
        } else if (id < p.id) {
            return -1;
        } else {
            return 0;
        }
    }
}
public class ProductPriorityQueue {
    public static void main(String[] args) {
        Queue<Product> queue=new PriorityQueue<Product>();
        Product p1=new Product(1,"oil",180);
        Product p2=new Product(2,"dal",65);
        Product p3=new Product(3,"maggi",10);

        queue.add(p1);
        queue.add(p2);
        queue.add(p3);
        System.out.println("transversing the queue element");
        for (Product p:queue){
            System.out.println(p.id + " : " + p.productname + " : " + p.price);
        }
        queue.remove();
        System.out.println("after removing element");
        for (Product p:queue){
            System.out.println( p.id + " : " + p.productname + " : " + p.price);
        }

    }
}

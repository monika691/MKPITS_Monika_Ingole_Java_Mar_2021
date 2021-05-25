/*1- program on linkedlist class

 */
package com.mkpits.java.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String> al=new LinkedList<String>();
        al.add("ravi");
        al.add("amit");
        al.add("ganesh");
        al.add("gaurav");

        Iterator<String> itr= al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

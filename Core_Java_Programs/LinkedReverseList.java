/*4 LinkedList Example to reverse a list of elements

 */
package com.mkpits.java.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedReverseList {
    public static void main(String[] args) {
        LinkedList<String> al=new LinkedList<String>();
        al.add("ravi");
        al.add("amit");
        al.add("ganesh");
        al.add("gaurav");
     Iterator itr= al.descendingIterator();
     while (itr.hasNext()){
         System.out.println(itr.next());
     }
    }
}

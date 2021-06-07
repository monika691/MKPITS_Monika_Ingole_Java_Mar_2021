/*program to create collection using arraydeque class

 */
package com.mkpits.java.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {
    public static void main(String[] args) {
        Deque<String> deque=new ArrayDeque<String>();
        deque.add("amit");
        deque.add("anil");
        deque.add("ajay");
        deque.add("akshay");

        //transvers element
        for (String str : deque){
            System.out.println(str);
        }
    }
}

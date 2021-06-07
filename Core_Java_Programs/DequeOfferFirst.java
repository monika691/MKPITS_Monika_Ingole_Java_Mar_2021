/*ArrayDeque Example: offerFirst() and pollLast()

 */
package com.mkpits.java.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeOfferFirst{
    public static void main(String[] args) {
        Deque<String> deque=new ArrayDeque<String>();
        deque.offer("aniket");
        deque.offer("amit");
        deque.add("karan");
        deque.offerFirst("jai");
        System.out.println("after offerfirst traversal");
        for (String s:deque){
            System.out.println(s);
        }
        deque.pollLast();
        System.out.println("after pollfirst() transversal");
        for (String s : deque){
            System.out.println(s);
        }
    }
}

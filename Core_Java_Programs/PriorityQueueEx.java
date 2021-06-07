/*1- program on priorityquee to add element, remove elements using peek, remove, pop method.

 */
package com.mkpits.java.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("amit");
        queue.add("raj");
        queue.add("amar");
        queue.add("akshay");
        queue.add("arnav");

        System.out.println("Head : " + queue.element());
        System.out.println("Head : " + queue.peek());
        System.out.println("Iterating the queue element");

        Iterator<String> itr= queue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing 2 element : ");

        Iterator<String> itr1= queue.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }



    }
}

/*program on removing elements from linkedlist.(remove, removeall, removefirst etc methods)

 */
package com.mkpits.java.collection;

import java.util.LinkedList;

public class LinkedListRemoveEx {
    public static void main(String[] args) {
        LinkedList<String> al = new LinkedList<String>();
        al.add("ravi");
        al.add("amit");
        al.add("ganesh");
        al.add("anurag");
        al.add("anurag");
        al.add("nahush");
        al.add("anil");

        System.out.println("initital list : " + al);

        al.remove("suhas");
        System.out.println("after invoking remove(object)method : "+al);

        al.remove(2);
        System.out.println("after invoking remove(int index)method : " + al);

        LinkedList<String> al1 = new LinkedList<String>();
        al1.add("ganesh");
        al1.add("suhas");

        al.addAll(al1);
        System.out.println("updating list : " + al);

        al.removeAll(al1);
        System.out.println("after invoking removeall()method : " + al);

        al.removeFirst();
        System.out.println("after invoking removefirst()method : " +al);

        al.removeLast();
        System.out.println("after invoking removelast()method : " +al);

        al.removeFirstOccurrence("anurag");
        System.out.println("after invoking removefirstoccurance()method : " +al);

        al.removeLastOccurrence("nahush");
        System.out.println("after invoking removelastoccurance()method :" +al);

        al.clear();
        System.out.println("after invokinf clear()method : " +al);


    }
}


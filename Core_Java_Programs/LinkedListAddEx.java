/*2- program on linkedlist to add element at particular position , addfirst method ,addlast method .

 */
package com.mkpits.java.collection;

import java.util.LinkedList;

public class LinkedListAddEx {
    public static void main(String[] args) {

        LinkedList<String> al = new LinkedList<String>();
        al.add("ravi");
        al.add("amit");
        al.add("ganesh");

        System.out.println("after invoking add(E e)method : " + al);

        al.add(1,"gaurav");

        System.out.println("after invoking add(int index,E element)method : " + al);
        LinkedList<String> al1=new LinkedList<String>();
        al1.add("anurag");
        al1.add("suhas");

        al.addAll(al1);
        System.out.println("after invoking add(collection<?extendsE>c)method :" + al);

        LinkedList<String> al2=new LinkedList<String>();
        al2.add("nahush");
        al2.add("anil");

        al.addAll(1,al2);
        System.out.println("after invoking add(int index collectiom<?extends E>c) method : " +al);

        al.addFirst("Lobhas");
        System.out.println("after invoking addfirst (E e) method : " + al);

        al.addLast("sohal");
        System.out.println("after invoking addlast(E e)method : " + al);


    }
}


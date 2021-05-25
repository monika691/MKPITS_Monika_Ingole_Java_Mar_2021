/*program on listiterator to traverse in forward and backword direction.

 */
package com.mkpits.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TransverseForwBack {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Rajesh");
        list.add("Kapil");
        list.add("Salman");
        list.add(1,"raju");

        ListIterator<String> al= list.listIterator();
        System.out.println("transversing element in forward direction");
        while (al.hasNext()){
            System.out.println("index : " +al.nextIndex() + " value : " +al.next());
        }
        System.out.println("transversing element in backward direction");
        while (al.hasPrevious()){
            System.out.println("index " +al.previousIndex()+ " value " +al.previous());
        }
    }
}

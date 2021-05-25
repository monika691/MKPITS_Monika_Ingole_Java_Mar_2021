/*19 program to display elements in reverse order in treeset class.

 */
package com.mkpits.java.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetDescending {
    public static void main(String[] args) {
        TreeSet<String> set=new TreeSet<String>();
        set.add("rahul");
        set.add("prem");
        set.add("amar");
        set.add("bhagwan");
System.out.println("transversing element through iterator by descending order");
        Iterator itr= set.descendingIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

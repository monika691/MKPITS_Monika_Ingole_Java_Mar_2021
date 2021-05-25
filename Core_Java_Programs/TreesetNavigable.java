/*example to perform various NavigableSet operations in treeset class

 */
package com.mkpits.java.collection;

import java.util.TreeSet;

public class TreesetNavigable {
    public static void main(String[] args) {
        TreeSet<String> set=new TreeSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        System.out.println("Initial set : " + set);
        System.out.println("Reverse set : " + set.descendingSet());
        System.out.println("Head set : " + set.headSet("C",true));
        System.out.println("Subset : " + set.subSet("A",false,"E",true));
        System.out.println("Tail set : " + set.tailSet("C",false));

    }
}

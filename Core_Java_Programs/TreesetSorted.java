/*example to perform various SortedSetSet operations.

 */
package com.mkpits.java.collection;

import java.util.TreeSet;

public class TreesetSorted {
    public static void main(String[] args) {
        TreeSet<String> set=new TreeSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");

        System.out.println("Initial set : " +set);
        System.out.println("Reverse set : " +set.descendingSet());
        System.out.println("Head set : " +set.headSet("C"));
        System.out.println("Sub set : " +set.subSet("A","E"));
        System.out.println("Tail set : " +set.tailSet("C"));

    }
}

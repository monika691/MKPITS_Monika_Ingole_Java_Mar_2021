/*20 example to retrieve and remove the highest and lowest Value.

 */
package com.mkpits.java.collection;

import java.util.TreeSet;

public class TreesetHigherLower {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(21);
        set.add(34);
        set.add(41);
        set.add(11);
        System.out.println("Highest value : " + set.pollFirst());
        System.out.println("Lowest value : " +set.pollLast());
    }
}

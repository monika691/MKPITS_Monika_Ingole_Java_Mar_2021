/*program to sort element of list collection.

 */
package com.mkpits.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("mango");
        list.add("apple");
        list.add("banana");
        list.add("orange");

        Collections.sort(list);
        for (String fruit : list) {
            System.out.println(fruit);
        }
        System.out.println("Sorting number...");
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(17);
        list1.add(11);
        list1.add(8);
        list1.add(15);

        Collections.sort(list1);
        for (Integer number : list1) {
            System.out.println(number);
        }
    }
}
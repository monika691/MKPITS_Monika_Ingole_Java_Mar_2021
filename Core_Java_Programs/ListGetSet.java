/*9 program on list to add element using set and retrieve element using get method.

 */
package com.mkpits.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ListGetSet {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("mango");
        list.add("apple");
        list.add("banana");
        list.add("orange");

        System.out.println("element returning : " +list.get(2));

        list.set(2,"grapes");
     for (String fruit : list){
         System.out.println(fruit);
     }
    }
}

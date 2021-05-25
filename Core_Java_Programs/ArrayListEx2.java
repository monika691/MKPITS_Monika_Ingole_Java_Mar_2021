/*Iterating Collection through remaining ways, an example to traverse the ArrayList elements through other ways

 */
package com.mkpits.java.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListEx2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("amit");
        list.add("nahush");
        list.add("anurag");

        System.out.println("Transversing list through list Iterator");

        ListIterator list1=list.listIterator(list.size());
        while (list1.hasPrevious()){
            String str = (String) list1.previous();
            System.out.println(str);
        }
        System.out.println("transversing list through for loop");
        for (int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("transversing list through for each loop");
        list.forEach(a->{
            System.out.println(a);
        });
    }
}

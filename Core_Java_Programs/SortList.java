/*collection sort arraylist example

 */
package com.mkpits.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();//creating arrylist
        list.add("mango");//adding object in arraylist
        list.add("grapes");
        list.add("banana");
        list.add("chikoo");
        list.add("apple");

        //sorting of array
        Collections.sort(list);

        //transversing list by using for each loop
        for (String fruits : list) {
            System.out.println(fruits);
        }
            System.out.println("sorting number");
         //creating arraylist
            ArrayList<Integer> list1=new ArrayList<Integer>();
            list1.add(13);
            list1.add(14);
            list1.add(11);
            list1.add(15);
            list1.add(12);
           //sort arraylist
            Collections.sort(list1);
         //transversing list by using for each loop
            for (Integer number : list1){
                System.out.println(number);
            }
        }

    }


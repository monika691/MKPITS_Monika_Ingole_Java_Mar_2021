/*program to How to convert List to Array.

 */
package com.mkpits.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListToArray {
    public static void main(String[] args) {
        List<String> friutlist=new ArrayList<String>();
        friutlist.add("mango");
        friutlist.add("orange");
        friutlist.add("banana");
        friutlist.add("apple");
        //convert arraylist to array
        String[] array=friutlist.toArray(new String[friutlist.size()]);
        System.out.println("Printing array : " + Arrays.toString(array));
        System.out.println("Printing list : " + friutlist);
    }
}

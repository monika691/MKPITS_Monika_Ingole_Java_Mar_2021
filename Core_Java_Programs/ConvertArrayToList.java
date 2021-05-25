/*program to How to convert Array to List

 */
package com.mkpits.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {
    public static void main(String[] args) {
        //creating array
        String[] array = {"amit,karan,parag"};
        System.out.println("printing array : " + Arrays.toString(array));

        //convert array to list
        List<String> list = new ArrayList<String>();
        for (String name : array) {
            list.add(name);
        }
        System.out.println("printing list : " + list);
    }
}

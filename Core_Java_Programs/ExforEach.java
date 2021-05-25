/*an example to traverse the ArrayList elements using the for-each loop

 */
package com.mkpits.java.collection;

import java.util.ArrayList;

public class ExforEach {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("mango");
        list.add("banana");
        list.add("apple");
        list.add("chikoo");

        for (String fruit : list ){
            System.out.println(fruit);
        }
    }
}

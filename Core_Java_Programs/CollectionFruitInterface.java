/*program to create collection of fruits using List interface.

 */
package com.mkpits.java.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionFruitInterface {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("mango");
        list.add("apple");
        list.add("grapes");
        list.add("orange");
        list.add("banana");
     for (String fruit :list){
         System.out.println(fruit);
     }
    }
}

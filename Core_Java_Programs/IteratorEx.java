/*example to traverse ArrayList elements using the Iterator interface.

 */
package com.mkpits.java.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("mango");
        list.add("banana");
        list.add("apple");

        Iterator itr=list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}

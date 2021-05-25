/*- program on linkedhashset class.

 */
package com.mkpits.java.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<String> set=new LinkedHashSet<String>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");


        Iterator<String> itr= set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

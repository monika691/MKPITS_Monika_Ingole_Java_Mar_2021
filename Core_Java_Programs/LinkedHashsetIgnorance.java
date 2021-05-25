/*program on linkedhashset ignoring duplicate elements

 */
package com.mkpits.java.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetIgnorance {
    public static void main(String[] args) {
        LinkedHashSet<String> set=new LinkedHashSet<String>();
        set.add("anil");
        set.add("anup");
        set.add("akshay");
        set.add("anup");

        Iterator<String> itr= set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

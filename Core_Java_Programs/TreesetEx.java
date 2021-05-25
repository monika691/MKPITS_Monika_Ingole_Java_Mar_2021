/*program to create collection using treeset class.

 */
package com.mkpits.java.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetEx {
    public static void main(String[] args) {
        TreeSet<String> set=new TreeSet<String>();
        set.add("monu");
        set.add("parmi");
        set.add("nilu");
        set.add("aashu");

        Iterator<String> itr= set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

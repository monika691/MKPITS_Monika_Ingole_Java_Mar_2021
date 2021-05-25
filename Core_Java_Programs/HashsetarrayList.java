/*program to create hashset collection using arraylist collection.

 */
package com.mkpits.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetarrayList {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("kunal");
        al.add("hardik");
        al.add("virat");

        HashSet<String> set=new HashSet<String>(al);
        set.add("gaurav");
        Iterator itr= set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

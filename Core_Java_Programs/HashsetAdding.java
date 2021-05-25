/*program on adding  element in hashset .

 */
package com.mkpits.java.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetAdding {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<String>();
        set.add("mohit");
        set.add("prasad");
        set.add("nikhil");
        Iterator<String> itr= set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

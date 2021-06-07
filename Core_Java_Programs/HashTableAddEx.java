/*- create a key value collection using hashtable class.

 */
package com.mkpits.java.collection3;

import com.sun.javafx.collections.MappingChange;

import java.util.Hashtable;
import java.util.Map;

public class HashTableAddEx {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
        ht.put(1,"manu");
        ht.put(2,"virat");
        ht.put(3,"mahi");

        for (Map.Entry<Integer,String> m:ht.entrySet()){
            System.out.println(m.getKey()+ "" + m.getValue());
        }

    }
}

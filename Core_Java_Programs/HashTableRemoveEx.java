/*Java Hashtable Example: remove()

 */
package com.mkpits.java.collection3;

import java.util.Hashtable;

public class HashTableRemoveEx {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
        ht.put(11,"nishu");
        ht.put(12,"viju");
        ht.put(13,"biju");

        System.out.println("Before remove : " +ht);

        ht.remove(12);

        System.out.println("after remove : " +ht);
    }
}

/*-  create a key value sorted collection using keymap class

 */
package com.mkpits.java.collection3;

import java.util.LinkedHashMap;

public class KeyValueEx {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
        hm.put(100,"rani");
        hm.put(101,"pooja");
        hm.put(102,"mayuri");

        System.out.println("Key : " +hm.keySet());
        System.out.println("values : "+hm.values());
        System.out.println("key-value pair : " + hm.entrySet());
    }
}

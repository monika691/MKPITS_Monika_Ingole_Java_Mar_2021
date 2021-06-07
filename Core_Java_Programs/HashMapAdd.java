/*example of collection to add key value using hashmap class.

 */
package com.mkpits.java.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapAdd {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        System.out.println("Initial list of element" + map);
        map.put(1, "lokesh");
        map.put(2, "manoj");
        map.put(3, "naina");

        System.out.println("after invoking put() method");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + "" + m.getValue());
        }
        map.putIfAbsent(4, "vishal");
        System.out.println("after invoking putIfabsent() method");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + "" + m.getValue());
        }
            HashMap<Integer, String> map1 = new HashMap<Integer, String>();
            map1.put(5, "nakul");
            map1.putAll(map);
            System.out.println("after invoking putall()method");
            for (Map.Entry m : map1.entrySet()) {
                System.out.println(m.getKey() + " " + m.getValue());
            }

        }
    }


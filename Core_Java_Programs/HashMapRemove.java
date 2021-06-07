/*example of collection to remove key value using hashmap class.

 */
package com.mkpits.java.collection;

import java.util.HashMap;

public class HashMapRemove {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(12,"raju");
        map.put(13,"manju");
        map.put(14,"viju");
        map.put(15,"dinu");

        System.out.println("Initial list of element : " +map);

        map.remove(12);
        System.out.println("updated list of element : " +map);

        map.remove(13);
        System.out.println("updated list of element : " +map);

        map.remove(14);
        System.out.println("updated list of element : " +map);

    }
}

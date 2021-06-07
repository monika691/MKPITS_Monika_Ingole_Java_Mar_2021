/*program on linkedhashmap class

 */
package com.mkpits.java.collection3;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
        hm.put(1,"karan");
        hm.put(2,"ravi");
        hm.put(3,"ajay");

        for (Map.Entry m: hm.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
}

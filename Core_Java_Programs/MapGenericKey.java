/*create a  generic key value collection using hasmap class and traverse using entryset and map.entry

 */
package com.mkpits.java.collection;

import java.util.HashMap;
import java.util.Map;

public class MapGenericKey {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(101,"ravi");
        map.put(103,"anu");
        map.put(102,"namu");

        //transvers map
        for (Map.Entry m:map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}

/*create a non generic key value collection using hasmap class and traverse using entryset and map.entry

 */
package com.mkpits.java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapNonGenericKey {
    public static void main(String[] args) {
        Map map=new HashMap();
        //adding element
        map.put(1,"anuj");
        map.put(3,"naresh");
        map.put(6,"nilesh");
        map.put(5,"arun");

        //transvers map
        Set set= map.entrySet();//converting to set so that we can transvers

        Iterator itr= set.iterator();
        while (itr.hasNext()){
            //converting to Map.set to get key and value
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

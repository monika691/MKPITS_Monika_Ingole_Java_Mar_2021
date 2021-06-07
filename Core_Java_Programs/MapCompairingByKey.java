/*Java Map Example: comparingByKey()

 */
package com.mkpits.java.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapCompairingByKey {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(11,"lokesh");
        map.put(12,"rajesh");
        map.put(13,"Pintu");
        map.put(14,"rahul");

        map.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByKey())
        .forEach(System.out::println);

    }
}

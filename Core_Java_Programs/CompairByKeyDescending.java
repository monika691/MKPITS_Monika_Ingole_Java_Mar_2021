/*Java Map Example: comparingByKey() in Descending Order

 */
package com.mkpits.java.collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class CompairByKeyDescending {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"ranu");
        map.put(2,"namu");
        map.put(3,"priya");

        map.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
        .forEach(System.out::println);

    }
}

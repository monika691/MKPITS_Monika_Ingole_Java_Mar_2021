/*program on removing element in hashset .

 */
package com.mkpits.java.collection;

import java.util.HashSet;

public class HashsetRemoving {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<String>();
        set.add("mohit");
        set.add("prasad");
        set.add("nikhil");
        set.add("rohit");
        System.out.println("updating list"+ set);
        set.remove("mohit");
        System.out.println("after invoking remove()method : " +set);

        HashSet<String> set1=new HashSet<String>();
        set1.add("kunal");
        set1.add("hardik");

        set.addAll(set1);
        System.out.println("updated list : " +set);

        set.removeAll(set1);
        System.out.println("after invoking removeall()method : " +set);

        set.removeIf(s -> set.contains("nikhil"));
        System.out.println("after invoking removeif()method : " +set);

        set.clear();
        System.out.println("after invoking clear()method : " +set);



    }
}

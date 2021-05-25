/*Get and Set ArrayList example

 */
package com.mkpits.java.collection;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class GetSetEx {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();//creating arraylist
        al.add("mango");//adding object in arraylist
        al.add("apple");
        al.add("banana");
        al.add("grapes");

        //creating get method by accesing element
        System.out.println("returning element : "+ al.get(2));//it will return 2nd element becoz index started from 0

        //creating set method by changing element
        al.set(2,"kiwi");
        //transversing
        for (String fruit : al){
            System.out.println(fruit);
        }

    }
}

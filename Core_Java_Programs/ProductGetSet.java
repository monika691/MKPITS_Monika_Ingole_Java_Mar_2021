/*Product example of set and get of arraylist class.

 */
package com.mkpits.java.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductGetSet {
    public static void main(String[] args) {
        ArrayList<String> product=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for (int i=1;i<=3;i++){
            System.out.println("enter product name");
            String pn= sc.next();
            product.add(pn);
        }System.out.println("Product number at index 2 : " + product.get(2));
        product.set(2,"ghee");
        for (String str : product){
            System.out.println("Prosuct name :" + str);
        }
    }
}

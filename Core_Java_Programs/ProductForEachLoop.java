/*Product program on traversing arraylist using foreach loop

 */
package com.mkpits.java.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductForEachLoop {
    public static void main(String[] args) {
        ArrayList<String> product=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for (int i=1;i<=3;i++){
            System.out.println("enter product name");
            String pn=sc.next();
            product.add(pn);
        }product.forEach(a->{
            System.out.println(a);
        });
    }
}

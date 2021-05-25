/*program on traversing arraylist using for loop

 */
package com.mkpits.java.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductForLoopSize {
    public static void main(String[] args) {
        ArrayList<String> product = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for (int i=1;i<=3;i++){
            System.out.println("enter product name");
            String pn = sc.next();
            product.add(pn);
        }for (int i=0;i< product.size();i++){
            System.out.println(product.get(i));
        }
    }
}
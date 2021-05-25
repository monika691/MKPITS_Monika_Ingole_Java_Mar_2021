/*wap to create colllection of program by accepting product name from the user.

 */
package com.mkpits.java.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> product=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for (int i=1;i<=3;i++){
            System.out.println("enter product name");
            String pn= sc.next();
            product.add(pn);
        }System.out.println("product name : " + product);
    }
}

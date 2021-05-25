/*Product  program on Traversing list through Iterator

 */
package com.mkpits.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class ProductListIterator {
    public static void main(String[] args) {
        ArrayList<String> product=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for (int i=1;i<=3;i++){
            System.out.println("enter product name");
            String pn= sc.next();
            product.add(pn);
        }
        Iterator itr=product.iterator();
        while (itr.hasNext()){
            System.out.println("product name : " + itr.next());
        }

    }
}

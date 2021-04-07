/*wap to accept number of byte datatype

 */
package com.mkpits.java.basicprogram;

import java.util.*;

public class CharDatatype {
    public static void main(String[] args)
    {
        char b='p';
        Scanner sc=new Scanner(System.in);
        System.out.println("b="+b);
        System.out.println("enter value");
        b=sc.next().charAt(0);
        System.out.println("value ="+b);
    }
}

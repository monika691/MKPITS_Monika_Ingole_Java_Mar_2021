/*1- wap to accept number of byte datatype

 */
package com.mkpits.java.basicprogram;
import java.util.*;
public class ByteDatatype {
    public static void main(String[] args)
    {
        byte b=127;
        Scanner sc=new Scanner(System.in);
        System.out.println("b="+b);
        System.out.println("enter number");
        b=sc.nextByte();
        System.out.println("number ="+b);

    }
}

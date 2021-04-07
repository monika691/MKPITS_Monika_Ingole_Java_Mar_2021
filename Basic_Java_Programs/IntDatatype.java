/*wap to accept number of int datatype

 */
package com.mkpits.java.basicprogram;
import java.util.*;
public class IntDatatype {
    public static void main(String[] args)
    {
        int b=32767;
        Scanner sc=new Scanner(System.in);
        System.out.println("b="+b);
        System.out.println("enter number");
        b=sc.nextInt();
        System.out.println("number ="+b);
    }
}

/*wap to accept number of double datatype

 */
package com.mkpits.java.basicprogram;

import java.util.*;

public class DoubleDatatype {
    public static void main(String[] args)
    {
        Double b=1234.567890123456789012345678;
        Scanner sc=new Scanner(System.in);
        System.out.println("b="+b);
        System.out.println("enter number");
        b=sc.nextDouble();
        System.out.println("number ="+b);
    }
}

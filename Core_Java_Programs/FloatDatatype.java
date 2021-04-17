/*wap to accept number of float datatype

 */
package com.mkpits.java.basicprogram;
import java.util.*;
public class FloatDatatype {
    public static void main(String[] args)
    {
        Float b=1234.567890123f;
        Scanner sc=new Scanner(System.in);
        System.out.println("b="+b);
        System.out.println("enter number");
        b=sc.nextFloat();
        System.out.println("number ="+b);
    }
}

/*3- wap to accept 2 no. and print additon of 2 no.

 */
package com.mkpits.java.basicprogramms;
import java.util.*;
public class AdditionOf2Number{
    public static void main(String[] args)
    {
        int num1,num2,res;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1");
        num1=sc.nextInt();
        System.out.println("Enter num2");
        num2=sc.nextInt();
        res=num1+num2;
        System.out.println("Addition of number " + res);


    }
}




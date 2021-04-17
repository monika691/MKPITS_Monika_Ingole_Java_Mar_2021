/*wap to accept a number and print whether it is a natural no.

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class NaturalNo {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter number");
        num=sc.nextInt();
        if(num>0)
        {
            System.out.println("number is natural");
        }
        else {
            System.out.println("number is not natural number");
        }
    }
}

/*wap to accept 3 numbers and print the multiplication of 3 no.

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class MultiOfNo {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int num1,num2,num3;
        int res;

        System.out.println("Enter 3 number");
        num1= sc.nextInt();
        num2= sc.nextInt();
        num3= sc.nextInt();

        res=num1*num2*num3;
        System.out.println("multiplication of number = " + res);
    }
}

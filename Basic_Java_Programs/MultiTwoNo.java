/*wap to accept 2 no and print multiplication of 2 no.


 */
package com.mkpits.java.clanguage;
import java.util.*;
public class MultiTwoNo {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int num1,num2,res;

        System.out.println("Enter 2 number");
        num1= sc.nextInt();
        num2=sc.nextInt();
        res =num1*num2;
        System.out.println("multiplication of number = " + res);
    }
}

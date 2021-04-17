/*1- wap to accept 2 no. and operator and display the result. using switch.

 */
package com.mkpits.java.basicprograms;
import java.util.*;
public class Accept2NoUsingSwitch {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num1,num2,res=0;
        char op;
        System.out.println("Enter number 1");
        num1=sc.nextInt();
        System.out.println("Enter number 2");
        num2=sc.nextInt();
        System.out.println("enter operator +,-,*");
        op=sc.next().charAt(0);

        switch(op) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            default:
                System.out.println("invalid operator");
                break;
        }
            System.out.println("result =" +res);
    }
}

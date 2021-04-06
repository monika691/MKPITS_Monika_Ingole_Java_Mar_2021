/*5 - wap to accept float number

 */
package com.mkpits.java.basicprogramms;

import java.util.Scanner;
public class FloatOperator {
    public static void main(String[] args)
    {
        float num1,num2,res=0;
        char op;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1");
        num1=sc.nextFloat();
        System.out.println("Enter number 2");
        num2=sc.nextFloat();
        System.out.println("Enter operator like + -");
        op=sc.next().charAt(0);
        if(op=='+')
            res=num1+num2;
        else if(op=='-')
            res=num1-num2;
        else
            System.out.println("invalid charactor");
        System.out.println("result is " + res);
    }
}



/*4 -wap to accept 2 no. and operator like +,-
        and display the result

        */
package com.mkpits.java.basicprogramms;
import java.util.*;
public class Operator {
    public static void main(String[] args)
    {
        int num1,num2,res=0;
        char op;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1");
        num1=sc.nextInt();
        System.out.println("Enter number 2");
        num2=sc.nextInt();
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


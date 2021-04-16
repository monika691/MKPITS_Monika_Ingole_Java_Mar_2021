/*- WAP TO ACCEPT 2 NO. AND OPERATOR (+, - , * \ ) FROM THE USER AND PRINT THE RESULT

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class OperatorUsingSwitchCase {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2,res;
        char op;
        System.out.println("Enter 2 number ");
        n1= sc.nextInt();
        n2= sc.nextInt();
        System.out.println("Enter operator + - * /");
        op=sc.next().charAt(0);
        switch(op)
        {
            case '+':
                res=n1+n2;
                System.out.println("result " +res);
                break;
            case '-':
                res=n1-n2;
                System.out.println("result " +res);
                break;
            case '*':
                res=n1*n2;
                System.out.println("result " +res);
                break;
            case '/':
                res=n1/n2;
                System.out.println("result " +res);
                break;
            default:
                System.out.println("invalid operator");
                break;
        }
    }
}

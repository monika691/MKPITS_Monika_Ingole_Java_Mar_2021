/*EXAMPLE OF UNARY OPERATOR

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class UnaryOperator {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int a=10;
        int b=4;
        int c;
        c=a++;
        System.out.println("a =" +a);
        System.out.println("c =" +c);
    }
}

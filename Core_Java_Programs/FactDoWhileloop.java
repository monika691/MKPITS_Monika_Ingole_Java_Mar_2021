/*- WAP TO ACCEPT A NUMBER AND PRINT FACTORAIL OF A NUMBER USING DO WHILE LOOP.

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class FactDoWhileloop {
    public static void main(String[] arg)
    {   Scanner sc=new Scanner(System.in);
        int num;
        int fact;
        int org_num;
        fact=1;
        System.out.println("Enter number");
        num = sc.nextInt();
        do {
            org_num=num;
            fact = fact * num;
            num--;
        }
        while (num>0);
        {
        System.out.println("factorial of number is =" + fact);

        }


    }
}

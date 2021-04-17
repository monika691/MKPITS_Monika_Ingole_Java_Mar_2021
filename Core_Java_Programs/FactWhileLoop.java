/*wap to accept a no. from the user and print the factorial of that number.
        factorial of 5! = 5*4*3*2*1  using while loop.

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class FactWhileLoop {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int num;
        int fact=1;

        System.out.println("Enter number");
                num= sc.nextInt();
        while(num>0)
        {
            fact = fact*num;
            num--;
        }
        System.out.println("Factorial of number =" +fact);
    }
}

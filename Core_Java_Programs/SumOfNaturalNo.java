/*15. Write a C program to find the sum of first 10 natural numbers.

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class SumOfNaturalNo {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0,cnt;
        System.out.printf("first 10 natural number");
        for(cnt=1;cnt<=10;cnt++)
        {
            sum =sum +cnt;
            System.out.println( + cnt);
        }
        System.out.println("the sum is =" + sum);
    }
}

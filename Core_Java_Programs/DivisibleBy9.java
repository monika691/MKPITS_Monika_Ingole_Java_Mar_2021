/*30 Write a program in C to find the number and sum of all integer between 100 and 200 which are divisible by 9.
        Numbers between 100 and 200, divisible by 9 :
        108 117 126 135 144 153 162 171 180 189 198
        The sum : 1683

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class DivisibleBy9 {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        System.out.println("Enter the numbers between 100 and 200 divisible by 9");
        for(n=101;n<=200;n++)
        {
            if(n%9==0)
            {
                System.out.println( + n);
                sum+=n;
            }
        }System.out.println("The sum = " + sum);
    }
}

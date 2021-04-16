/*25 Write a C program to determine whether a given number is prime or not0.

 */
 package com.mkpits.java.clanguage;
import java.util.*;
public class PrimeNoOrNot {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int num,cnt=2,rem=0;
        System.out.println("Enter number");
        num= sc.nextInt();
        while(cnt<num)
        {
            rem =num %cnt;
            if(rem==0)
            {
                break;
            }cnt++;
        }if(cnt==num)
    {
        System.out.println("it is prime number");
    }
        else{
            System.out.println("it is not prime number");
    }

    }
}

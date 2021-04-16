/*16. Write a program in C to read 10 numbers from keyboard and find their sum and average.

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class SumAndAvgOfNum {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int num,sum=0,cnt;
        float avg;
        for(cnt=1;cnt<=10;cnt++)
        {
            System.out.println("enter number");
            num= sc.nextInt();
            sum =sum +num;
        }
        System.out.println("sum of number = " + sum);
        avg = sum /10;
        System.out.println("average =" + avg);
    }
}

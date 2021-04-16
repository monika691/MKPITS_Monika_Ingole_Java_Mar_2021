/*27 Write a program in C to display the first n terms of Fibonacci series.
        Input number of terms to display : 10
        Expected Output :
        Here is the Fibonacci series upto to 10 terms :
        0 1 1 2 3 5 8 13 21 34

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class FibonacciNumber {
    public static void main(String[] arg)
    {
        Scanner sc= new Scanner(System.in);
        int fib1=0,fib2=1,fib3,num,cnt=0;
        System.out.println("Enter value of num");
        num= sc.nextInt();
        System.out.println("first fibonacci series is: " + num);
        System.out.println(+fib1);
        System.out.println(+fib2);
        while(cnt < num)
        {
            fib3=fib1+fib2;
            cnt++;
            System.out.println(+fib3);
            fib1=fib2;
            fib2=fib3;
        }
    }
}

/*wap to accept a number and display the message  "number is even"
        if remainder of a number is 0 if divided by 2

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class EvenNo {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int num;
        int rem=0;
        System.out.println("Enter number");
        num=sc.nextInt();
        rem=num%2;
        if(rem==0)
        {
            System.out.println("number is even");
        }
    }
}

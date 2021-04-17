/*wap to accept a number and print the armstrong no.

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class ArmstrongNo {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
         int num,r,sum=0,temp;

         System.out.println("Enter number");
         num= sc.nextInt();

         for(temp=num;num!=0;num=num / 10) {
             r = num % 10;
             sum = sum + (r * r * r);
         }
             if (sum==temp)
             {
                 System.out.println("Armstrong Number"+ temp);
             }
             else {
                 System.out.println("not Armstrong number"+temp);
             }


    }
}

/*18.  Write a program in C to display the multiplication table of a given integer.

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class MultiplicationTableOfNumber {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int num;
        int cnt,res=1;
        System.out.println("Enter number");
        num= sc.nextInt();
        for(cnt=1;cnt<=10;cnt++)
        {
            res= num*cnt;
            System.out.println("table of number " +num +'*' + cnt + '='  + res);
        }
    }
}

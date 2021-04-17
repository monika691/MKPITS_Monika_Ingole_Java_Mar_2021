/*2- wap in java to accept a number and  print the square of that number

 */
package com.mkpits.java.basicprogramms;
import java.util.*;
public class Square {
    public static void main(String[] args)
    {
        int num,sq;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        num=sc.nextInt();
        sq=num*num;
        System.out.println("square of number is "+ sq);
    }
}

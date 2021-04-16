/*Write a C program to find the largest of three numbers

 */
 package com.mkpits.java.clanguage;
 import java.util.*;
public class LagestNumber {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Enter 1 number");
        n1=sc.nextInt();
        System.out.println("Enter 2 number");
        n2=sc.nextInt();
        System.out.println("Enter 3 number");
        n3=sc.nextInt();

        if(n1 >= n2 && n1 >= n3)
        {
            System.out.println("n1 is larger ");
        }
        else if(n2 >= n1 && n2 >=n3)
        {
            System.out.println(" n2 is larger ");
        }
        else{
            System.out.println("n3 is larger ");
        }
    }
}

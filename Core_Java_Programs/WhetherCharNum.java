/*Write a C program to check whether a character is an alphabet,
        digit or special character

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class WhetherCharNum {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        char ch;
        System.out.println("Enter any character\n");
        ch=sc.next().charAt(0);

        if((ch >= 'a' && ch <='z') ||(ch >= 'A' && ch <= 'Z'))
        {
            System.out.println("character is alphabet " +ch);
        }
        else if(ch >= '0' && ch <= '9')
        {
            System.out.println("character is digit " +ch );
        }
        else{
            System.out.println("character is special character " +ch);
        }
    }
}

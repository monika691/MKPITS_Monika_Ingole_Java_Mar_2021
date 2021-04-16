/*1- wap to accept 2 numbers from the user and display the greater number.(if else)

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class GreaterNoTwo {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter 2 number");
        n1= sc.nextInt();
        n2= sc.nextInt();
        if(n1>n2)
        {
            System.out.println("n1 is greater "+n1);
        }else{
            System.out.println("n2 is greater "+ n2);
        }
    }
}

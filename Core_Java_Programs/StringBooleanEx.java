/*7	boolean contains(CharSequence s)	returns true or false after matching the sequence of char value.

 */
package com.mkpits.java.string;

import java.util.Scanner;

public class StringBooleanEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter email id");
        String email=sc.next();
        boolean ss=email.contains(".com");
        if(ss==true)
        {
            System.out.println("valid email id");
        }
        else{
            System.out.println("not valid email");
        }
    }

}

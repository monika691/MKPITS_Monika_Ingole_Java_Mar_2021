/*2) StringBuffer insert() method

The insert() method inserts the given string with this string at the given position.
*/
package com.mkpits.java.Stringbuffer;

import java.util.Scanner;

public class InserMethodEx {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name ");
        String fn= sc.next();

        StringBuffer sb=new StringBuffer(fn);

        System.out.println("enter lname");
        String ln=sc.next();

        sb.insert(5,ln);
        System.out.println(sb);
    }
}

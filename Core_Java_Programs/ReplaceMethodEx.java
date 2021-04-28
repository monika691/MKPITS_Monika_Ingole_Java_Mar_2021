/*StringBuffer replace() method
 */
package com.mkpits.java.Stringbuffer;

import java.util.Scanner;

public class ReplaceMethodEx {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your name");
        String fn= sc.next();
        StringBuffer sb= new StringBuffer(fn);
        System.out.println("enter lname");
        String ln= sc.next();
        sb.replace(1,3,"java");
        System.out.println(sb);

    }
}

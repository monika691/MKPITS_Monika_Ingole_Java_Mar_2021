/*StringBuffer delete() method
 */
package com.mkpits.java.Stringbuffer;

import java.util.Scanner;

public class DeleteMethodEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first name");
        String fn= sc.next();
        StringBuffer sb=new StringBuffer(fn);
        System.out.println("enter lname");
        String ln=sc.next();
        sb.delete(1,3);
        System.out.println(sb);
    }
}

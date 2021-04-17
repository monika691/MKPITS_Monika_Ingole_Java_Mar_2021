/*WAP TO ACCEPT YOUR NAME AND THEN DISPLAY IT

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class DisplayName {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("Enter name");
         name=sc.next();
        System.out.println("your name is " +name);
    }
}

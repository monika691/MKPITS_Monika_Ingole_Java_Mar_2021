/*WAP ACCEPT A NUMBER AND PRINT FROM 1 TO THAT NUMBER USING DO WHILE LOOP.

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class NToThatNo {
    public static void main(String[] arg)
    {   Scanner sc=new Scanner(System.in);
        int n;
        int i=0;
        System.out.println("Enter number");
        n=sc.nextInt();
        i=n;
        do{
            System.out.println("numbers = " + i);
            i--;

        }while(i>=1);
    }
}

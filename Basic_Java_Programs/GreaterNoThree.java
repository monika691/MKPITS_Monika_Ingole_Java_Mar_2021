/*2- wap to accept 3 numbers from the user and display the greater numbers(if elseif ...)

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class GreaterNoThree {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("enter 3 numbers");
        n1= sc.nextInt();
        n2= sc.nextInt();
        n3= sc.nextInt();

        if(n1>n2 && n1>n3)
        {
            System.out.println("n1 is greater "+n1);
        }
        else if(n2>n1 && n2>n3)
        {
            System.out.println("n2 is greater " +n2);
        }
        else{
            System.out.println("n3 is greater " +n3);
        }
    }
}

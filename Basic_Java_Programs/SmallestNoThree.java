/*wap to accept 3 numbers from the user and display the smallest no.

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class SmallestNoThree {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Enter 3 numbers");
        n1= sc.nextInt();
        n2= sc.nextInt();
        n3= sc.nextInt();
        if(n1<n2 && n1<n3)
        {
            System.out.println("n1 is smaller");
        }
        else if(n2<n1 && n2<n3)
        {
            System.out.println("n2 is smaller");
        }
        else{
            System.out.println("n3 is smaller");
        }
    }
}

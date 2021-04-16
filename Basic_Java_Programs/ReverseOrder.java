/*28 Write a program in C to display the number in reverse order.8Input a number: 123
        Expected Output :
        The number in reverse order is : 321

 */

package com.mkpits.java.clanguage;
import java.util.*;
public class ReverseOrder {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int n,rem,rev=0;
        System.out.println("Enter number");
        n=sc.nextInt();
        while(n!=0)
        {
            rem = n%10;
            rev=rev*10+rem;
            n/=10;
        }System.out.println("reverse number " + rev);
    }
}

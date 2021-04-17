/*7 wap to accept 2 no. and display the greater no.


 */

package com.mkpits.java.basicprogramms;
import java.util.*;
public class Display2GreaterNumber {
    public static void main(String[] args)
    {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1");
        num1=sc.nextInt();
        System.out.println("Enter number 2");
        num2=sc.nextInt();
        if(num1>num2)
            System.out.println("number 1 is greater "+num1);
        else
            System.out.println("number 2 is greater " +num2);
    }
}

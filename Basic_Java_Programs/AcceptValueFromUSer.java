/*10 accept the value from the user


 */
package com.mkpits.java.basicprograms;
import java.util.*;
public class AcceptValueFromUSer {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num[] = new int[3];
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter number");
            num[i]=sc.nextInt();
        }for (int n: num)
    {
        System.out.println("number = " +n);
    }
    }
}


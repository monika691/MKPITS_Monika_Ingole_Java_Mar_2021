/*4- wap to accept a no. and print factorial of a number using while loop

 */
package com.mkpits.java.basicprograms;
import java.util.*;
public class FactUsingWhileLoop {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num;
        int fact=1;
        System.out.println("Enter number");
        num=sc.nextInt();

        while(num >0){
            fact=fact*num;
            num--;
        }System.out.println("factorial of num "+fact);
    }
}

/*4- wap to accept age from the user and display wheter he is eligible to vote or not.

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class VoteEligibility {
    public static void main(String[] arg)
    {
        Scanner sc= new Scanner(System.in);
        int age;
        System.out.println("Enter your age");
        age= sc.nextInt();
        if(age>=18)
        {
            System.out.println("you are eligible for vote");
        }
        else{
            System.out.println("you are not eligible");
        }
    }
}

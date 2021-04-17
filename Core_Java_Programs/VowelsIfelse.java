/*-WAP TO ACCEPT A CHARACTER FROM THE USER AND PRINT WHETHER IT IS VOWEL OR NOT USING IF ELSE IF.


 */
package com.mkpits.java.clanguage;
import java.util.*;
public class VowelsIfelse {
    public static void main(String[] arg)
    {
        Scanner sc= new Scanner(System.in);
        char ch;
        System.out.println("Enter any character");
        ch=sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println("it is vowel");
        }
        else{
            System.out.println("it is not vowel");
        }
    }
}

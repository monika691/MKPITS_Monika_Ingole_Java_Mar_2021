/*WAP TO ACCEPT A CHARACTER FROM THE USER AND PRINT WHETHER IT IS VOWEL OR NOT.
        USING SWITCH CASE.

 */

package com.mkpits.java.clanguage;
import java.util.*;
public class VowelSwitchcase {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        char ch;
        System.out.println("enter any charachter");
        ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'a':
                System.out.println("it is vowel");
                break;
            case 'e':
                System.out.println("it is vowel");
                break;
            case 'i':
                System.out.println("it is vowel");
                break;
            case 'o':
                System.out.println("it is vowel");
                break;
            case 'u':
                System.out.println("it is vowel");
                break;
            default:
            System.out.println("it is not a vowel");
            break;

        }
    }

}

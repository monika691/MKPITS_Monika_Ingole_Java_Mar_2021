/*9 Write a program in C to accept a grade and declare the equivalent description :
        Grade 	Description
        E 	Excellent
        V 	Very Good
        G 	Good
        A 	Average
        F 	Fail

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class GradeDiscription {
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("Enter any chracter(E,V,G,A,F)\n");
        ch=sc.next().charAt(0);

        switch(ch)
        {
            case 'E':
                System.out.println("Excellent");
                break;

            case 'V':
                System.out.println("Very Good");
                break;

            case 'G':
                System.out.println("Good");
                break;

            case 'A':
                System.out.println("Average\n");
                break;

            case 'F':
                System.out.println("Fail\n");
                break;

            default:
                System.out.println("Invalid character\n");
        }
    }
}

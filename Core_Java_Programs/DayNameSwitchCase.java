/*10 Write a program in C to read any day number in integer and
        display day name in the word

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class DayNameSwitchCase {
    public static void main(String[] arg)
    {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("Enter day number(1-7)\n");
        n= sc.nextInt();

        switch(n)
        {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}

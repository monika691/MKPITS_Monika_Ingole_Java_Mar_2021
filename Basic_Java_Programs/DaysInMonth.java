/*Write a program in C to read any Month Number in integer and
        display the number of days for this month.

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class DaysInMonth {
    public static void main(String[] arg)
    {
        Scanner sc =new Scanner(System.in);
        int month;
        System.out.println("Enter month number(1-12):\n");
        month= sc.nextInt();

        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;

            case 2:
                System.out.println("28/29 days");
                break;

            default:
                System.out.println("invalid month");
        }
    }
}

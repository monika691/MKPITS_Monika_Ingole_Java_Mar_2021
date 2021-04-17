
/*WAP TO ACCEPT A DAY NUMBER (BETWEEN 1 AND 7 ) AND DISPLAY THE DAYNAME USING SWITCH STATEMENT
        AND IF STATEMENT

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class DayNoUsingSwitch {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter day 1-7");
        num= sc.nextInt();
        switch(num)
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
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid number");
                break;
        }
    }
}

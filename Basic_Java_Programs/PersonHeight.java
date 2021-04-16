/*1 Write a C program to accept the height of a person in centimeter and
        categorize the person according to their height.

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class PersonHeight {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int perheight;
        System.out.println("Enter height of person in centimeter\n");
        perheight=sc.nextInt();

        if(perheight >=180.0)
        {
            System.out.println("The person is taller\n");
        }else if(perheight >=155.0)
        {
            System.out.println("The person is average heighted\n");
        }else if (perheight < 150.0)
        {
            System.out.println("The person is small heighted\n");
        }else{
            System.out.println("abnormal height\n");
        }
    }

}

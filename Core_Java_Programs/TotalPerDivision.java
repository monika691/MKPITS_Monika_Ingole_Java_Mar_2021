/*Write a C program to read roll no, name and marks of three subjects and
        calculate the total, percentage and division

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class TotalPerDivision {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int rollno, sub;
        int total = 0, cnt;
        float per;
        String name;

        System.out.println("Enter rollno ");
        rollno = sc.nextInt();
        System.out.println("Enter name ");
         name = sc.next();
        for (cnt = 1; cnt <= 3; cnt++) {
            System.out.println("Enter  subject marks");
            sub= sc.nextInt();
            total= total+ sub;
        }
        System.out.println("total marks " + total);

        per = (float) (total / 300.0f) * 100.0f;
        System.out.println("percentage  " + per);

        if (per >= 75) {
            System.out.println("\ngrade : distinction");
        } else if (per < 75 && per > 60) {
            System.out.println("\n grade : first class");
        } else if (per > 40 && per < 60) {
            System.out.println("\n grade : secound division");
        } else
            System.out.println("\nyou are failed");

    }

}


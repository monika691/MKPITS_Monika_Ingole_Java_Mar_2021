/*4- program on Iterating ArrayList using For-each loop

 */
package com.mkpits.java.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentForLoopEx {
    public static void main(String[] args) {
        ArrayList<String> stud = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("enter student name");
            String sn = sc.next();
            stud.add(sn);
        }
        for (String str : stud) {
            System.out.println("Student name : " + str);
        }
    }
}
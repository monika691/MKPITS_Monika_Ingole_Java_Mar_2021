/*6- example of set and get of arraylist class.

 */
package com.mkpits.java.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentGetSetEx {
    public static void main(String[] args) {
        ArrayList<String> stud=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for (int i=1;i<=3;i++) {
            System.out.println("enter student name");
            String sn = sc.next();
            stud.add(sn);
        } System.out.println("Student at index 1 :" +stud.get(1));
            stud.set(1,"rajesh");
        for (String str : stud){
            System.out.println(str);
        }
    }
}

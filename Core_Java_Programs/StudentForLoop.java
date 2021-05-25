/*12 - program on traversing arraylist using for loop

 */
package com.mkpits.java.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentForLoop {
    public static void main(String[] args) {
        ArrayList<String> stud=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for (int i=1;i<=3;i++){
            System.out.println("enter student name");
            String sn= sc.next();
            stud.add(sn);
        }for (int i=0;i< stud.size();i++){
            System.out.println(stud.get(i));
        }
    }
}

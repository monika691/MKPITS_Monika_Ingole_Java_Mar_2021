/*Student- program to sort arraylist elements

 */
package com.mkpits.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentSortLIst {
    public static void main(String[] args) {
        ArrayList<String> stud=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for (int i=1;i<=5;i++){
            System.out.println("enter student name");
            String sn=sc.next();
            stud.add(sn);
        }
        Collections.sort(stud);
        for (String str : stud){
            System.out.println("Student name : " + str);
        }
    }


}

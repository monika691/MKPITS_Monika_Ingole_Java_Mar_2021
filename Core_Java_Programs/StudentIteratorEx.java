/*3- program on Traversing list through Iterator

 */
package com.mkpits.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentIteratorEx {
    public static void main(String[] args) {
        ArrayList<String> stud=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for (int i=1;i<=3;i++){
            System.out.println("enter student name");
            String sn=sc.next();
            stud.add(sn);
        }
        Iterator itr=stud.iterator();
        while (itr.hasNext()){

            System.out.println("Student name : "+ itr.next());
        }
    }
}

package com.mkpits.java.basicprograms;

import java.util.Scanner;

public class StudentEx {
   static class student1{
        int rolno;
        String name;

        void getdata(int r,String n)
        {
            rolno=r;
            name=n;
        }
        void showdata()
        {
            System.out.println("rolno : " +rolno);
            System.out.println("name : " +name);
        }
    }
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        student1 stud = new student1();
        System.out.println("Enter rollno and name ");
        int r=sc.nextInt();
        String n=sc.next();
        stud.getdata(r,n);
        stud.showdata();
    }
}

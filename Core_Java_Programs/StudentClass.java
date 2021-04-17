//ex 3 : another example of student class
//
package com.mkpits.java.basicprograms;

 class StudentClass {
     public static void main(String[] arg)
     {
         Student s1=new Student();
         s1.getstudentdata(123, "amit");
         s1.displaystudentdata();
     }
 }
     class Student
     {
         int rollno;
         String name;

         void getstudentdata(int r, String n)
         {
             rollno = r;
             name = n;
         }

         void displaystudentdata()
         {
             System.out.println("roll no " + rollno);
             System.out.println("name " + name);
         }
     }



/*2.
Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively
by creating two objects of class 'Student'.
 */

package com.mkpits.java.assignmentday;
class Student1{
    int rollno;
    long phno;
    String name;
    String addr;
}
public class OopsAss2 {
    public static void main(String[] args) {
        Student1 s=new Student1();
        Student1 s1=new Student1();
        s.name="sam";
        s.rollno=11;
        s.phno=235877865;
        s.addr="sadar";
        s1.name="John";
        s1.rollno=12;
        s1.phno=354678691;
        s1.addr="dhule";
        System.out.println(s.name + ":" + s.rollno + ":" + s.phno + ":" + s.addr);
        System.out.println(s1.name + ":" + s1.rollno + ":" + s1.phno + ":" + s1.addr);

    }
}

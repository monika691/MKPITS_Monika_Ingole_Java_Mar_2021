/*1.
Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
 */

package com.mkpits.java.assignmentday;
class Student{
    String name="John";
    int rollno=2;
}
public class OOpsAss1 {
    public static void main(String[] args) {
        Student s=new Student();
        System.out.println(s.name);
        System.out.println(s.rollno);
    }
}

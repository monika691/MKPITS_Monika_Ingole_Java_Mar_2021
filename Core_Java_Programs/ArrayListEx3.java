/* an example where we are storing Student class object in an array list.

 */
package com.mkpits.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class Student{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;

    }
}
public class ArrayListEx3 {
    public static void main(String[] args) {

        Student s1=new Student(11,"mohini",23);
        Student s2=new Student(12,"mohnish",25);
        Student s3=new Student(13,"mohit",27);

        ArrayList<Student> stud=new ArrayList<Student>();

        stud.add(s1);
        stud.add(s2);
        stud.add(s3);

        Iterator itr=stud.iterator();
        while (itr.hasNext()){
            Student st=(Student)itr.next();
            System.out.println(st.rollno+st.name+st.age);

        }


    }
}

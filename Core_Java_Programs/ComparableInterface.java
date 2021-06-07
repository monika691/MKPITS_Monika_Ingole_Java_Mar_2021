/*- the example of a Comparable interface that sorts the list elements on the basis of age.

 */
package com.mkpits.java.collection3;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;

    }
    @Override
    public int compareTo(Student s) {
        if (age == s.age) {
            return 0;
        } else if (age < s.age) {
            return 1;
        } else {
            return -1;
        }
    }
}
public class ComparableInterface {
    public static void main(String[] args) {
        ArrayList<Student> stud = new ArrayList<Student>();
        stud.add(new Student(11, "mohit", 23));
        stud.add(new Student(12, "rohit", 25));
        stud.add(new Student(11, "raj", 26));

        Collections.sort(stud);
        for (Student s : stud) {
            System.out.println(s.id + " " + s.name + " " + s.age);
        }
    }
}

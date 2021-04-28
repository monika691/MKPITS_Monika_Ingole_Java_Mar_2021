/*Example of clone() method (Object cloning)

Let's see the simple example of object cloning

 */
package com.mkpits.java.objcloning;

public class Student7 implements Cloneable {
    int rollno;
    String name;

    Student7(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try{
            Student7 s= new Student7(22,"mona");
            Student7 s1=(Student7) s.clone();
            System.out.println("s rollno" + s.rollno + "name " + s.name);
            System.out.println("s1 rollno" + s1.rollno + "name " + s1.name);
        }catch (CloneNotSupportedException ex){
            System.out.println(ex.toString());
        }
    }
}

/*Simple Example of Encapsulation in Java

Let's see the simple example of encapsulation that has only one field with its setter and getter methods.
encapsulartion is 2nd part of student program
 */
package com.mkpits.java.encpsultion;

public class EncapsulationEx1 {
    public static void main(String[] args) {
        //instance variable of encapsulation class
        Student s=new Student();
        //setting value in name member
        s.setName("nahush");
        //getting value in name member
        System.out.println(s.getname());
    }
}

/*5 - Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by
 creating a class named 'Rectangle' with a method named 'Area' which returns the area
 and length and breadth passed as parameters to its constructor.
 */
package com.mkpits.java.assignmentday;
class Rectangle{
    int length;
    int breadth;
     public float Area()
    {
        return length*breadth;
    }
}

public class OopsAss5 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=4;
        r.breadth=5;

        Rectangle r1=new Rectangle();
        r1.length=5;
        r1.breadth=8;

        System.out.println("area of rectangle is : " +r.Area());
        System.out.println("area of rectangle is : " + r1.Area());
    }
}

/*6.
Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
 First method named as 'setDim' takes length and breadth of rectangle as parameters and
  the second method named as 'getArea' returns the area of the rectangle.
  Length and breadth of rectangle are entered through keyboard.
 */
package com.mkpits.java.assignmentday;
import java.util.*;
class Area{
    int length;
    int breadth;
    void setDim(int length,int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
      public float getarea()
    {
        return (length * breadth);
    }
}
public class oopsAss6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area a= new Area();
        System.out.println("Enter length and breadth");
        int length= sc.nextInt();
        int breadth= sc.nextInt();
        a.setDim(length,breadth);
        System.out.println("Area of rectangle "+a.getarea());
        a.getarea();

    }

}

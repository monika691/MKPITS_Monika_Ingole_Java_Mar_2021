/*7-Write a program to print the area of a rectangle by creating a class named 'Area' taking the values
of its length and breadth as parameters of its constructor and having a method named 'returnArea'
which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
 */

package com.mkpits.java.assignmentday;
import java.util.*;
class Area1{
    int length;
    int breadth;
     Area1(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
     float returnarea()
     {
        return length*breadth;
     }
}
public class OopsAss7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length and breadth");
        int length = sc.nextInt();
        int breadth= sc.nextInt();
        Area1 a=new Area1(length,breadth);
        System.out.println("area of rectangle is : " +a.returnarea());
    }
}

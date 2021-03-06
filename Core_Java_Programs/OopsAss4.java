/*4. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units
by creating a class named 'Triangle' with constructor having the three sides as its parameters.
 */
 package com.mkpits.java.assignmentday;

class Triangle1{
    int a;
    int b;
    int c;
    public double area(int a,int b,int c)
    {
        double s=((a+b+c)/2);
        return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);

    }
    public float perimeter(int a,int b,int c){
        return (float) ((a+b+c)/2);
    }

}
public class OopsAss4 {
    public static void main(String[] args) {
        Triangle1 t=new Triangle1();
        int a=3;
        int b=4;
        int c=5;
        System.out.println("area of triangle is " + t.area(a,b,c));
        System.out.println("perimeter of triangle is " + t.perimeter(a,b,c));
    }
}

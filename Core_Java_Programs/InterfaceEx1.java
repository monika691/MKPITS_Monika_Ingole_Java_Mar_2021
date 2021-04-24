package com.mkpits.java.sb;

interface Shape{
    void draw();
}
class Circle1 implements Shape{
    public void draw() {
       System.out.println("code to draw circle");
    }
}
public class InterfaceEx1 {
    public static void main(String[] args) {
        Shape s=new Circle1();
        s.draw();
    }
}

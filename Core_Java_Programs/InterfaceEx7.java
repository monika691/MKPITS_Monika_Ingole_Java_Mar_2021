/*Java 8 Default Method in Interface

 */
package com.mkpits.java.sb;
interface  Drawable1{
    void draw();
    default void msg() {
        System.out.println("default method");
    }
}
class Rectangle1 implements Drawable1{
    public void draw() {System.out.println("drawing rectangle");

    }
}
public class InterfaceEx7 {
    public static void main(String[] args) {
        Drawable1 d=new Rectangle1();
        d.draw();
        d.msg();
    }
}

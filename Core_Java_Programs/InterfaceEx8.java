/*Java 8 Static Method in Interface

 */
package com.mkpits.java.sb;
interface Drawable2{
    void draw();
    static int cube(int x)
    {
        return x*x*x;
    }
}
class Rectangle3 implements Drawable2{
    public void draw() {
       System.out.println("drawing rectangle");
    }
}
public class InterfaceEx8 {
    public static void main(String[] args) {
        Drawable2 d=new Rectangle3();
        d.draw();
        System.out.println(Drawable2.cube(3));
    }
}

/*the above example, Printable and Showable interface have same methods but its implementation is
provided by class TestTnterface1, so there is no ambiguity.
Interface inheritance
A class implements an interface, but one interface extends another interface.
 */
package com.mkpits.java.sb;
interface Printable3{
    void print();
}
interface Showable2 extends Printable2{
    void show();
}
class InterfaceEx6 implements Printable3,Showable2{
    public void print() {System.out.println("Hello");}
    public void show() {System.out.println("Welcome");}

    public static void main(String[] args) {
        InterfaceEx6 i=new InterfaceEx6();
        i.print();
        i.show();
    }
}

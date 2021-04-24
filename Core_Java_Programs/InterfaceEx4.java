/*Multiple inheritance in Java by interface

 */
package com.mkpits.java.sb;
interface Printable1{
    void print();
}
interface Showable{
    void show();
}
public class InterfaceEx4 implements Printable1,Showable{
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}

    public static void main(String[] args) {
        InterfaceEx4 i=new InterfaceEx4();
        i.print();
        i.show();
    }
}

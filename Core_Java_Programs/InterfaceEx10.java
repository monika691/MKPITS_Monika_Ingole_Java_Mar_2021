package com.mkpits.java.sb;
interface A2{
    void a();
    void b();
    void c();
    void d();
}
abstract class B implements  A2{
    public void c(){System.out.println("I am C");}
}
class M extends B{
    public void a(){System.out.println("I am A");}
    public void b(){System.out.println("I am B");}
    public void d(){System.out.println("I am D");}
}
public class InterfaceEx10 {
    public static void main(String[] args) {
        A2 a= new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}

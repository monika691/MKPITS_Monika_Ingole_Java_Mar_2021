package com.mkpits.java.downcasting;
interface Printable{}
class A implements Printable{
    public void a()
    {
        System.out.println("a method");
    }
}
class B implements Printable{
    public void b()
    {
        System.out.println("b method");
    }
}
class call2{
    void invoke(Printable p)//upcasting
    {
        if(p instanceof A)
        {
            A a=(A)p;
            a.a();
        }
        if (p instanceof B)
        {
            B b=(B)p;
            b.b();
        }
    }
}//end of class call
public class DowncastingEx3 {
    public static void main(String[] args) {
        Printable p=new B();
        call2 c=new call2();
        c.invoke(p);
    }
}

package com.mkpits.java.instanceinitialiserblock;

class A{
    A()
    {
        System.out.println("parent class is invoked");
    }
}
class B1 extends A {
    B1()
    { super();
        System.out.println("child class is invoked");
    }

    {
        System.out.println("instance initializer block is invoked");
    }
}

public class Instaninitiblock {
    public static void main(String[] args) {
        B1 b=new B1();
    }
}

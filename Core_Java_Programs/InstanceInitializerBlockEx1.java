package com.mkpits.java.instanceinitialiserblock;
class A1{
    A1()
    {
        System.out.println("parent class is invoked");
    }
}
class B2 extends A1 {
    B2() {
        super();
        System.out.println("child class is invoked");
    }

    B2(int a)
    {
        System.out.println("child class is invoked " + a);
    }
    {
        System.out.println("Instance initializer block is invoked ");
    }
}

public class InstanceInitializerBlockEx1 {
    public static void main(String[] args) {
        B2 b=new B2();
        B2 b1=new B2(10);
    }
}

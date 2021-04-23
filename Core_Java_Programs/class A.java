package com.mkpits.java.covarientreturntype;

class A{
    A get(){
        return this;
    }
}
class B1 extends A {
    B1 get() {
        return this;
    }

    void message() {
        System.out.println("welcome to covarient return type");
    }
    public static void main(String[] args) {
            new B1().get().message();
        }
    }

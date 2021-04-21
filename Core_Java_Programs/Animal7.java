package com.mkpits.java.polymorphism;

class Animal7{
    void eat()
    {
        System.out.println("Animal is eating...");
    }
}
class Dog2 extends Animal7{
    void eat()
    {
        System.out.println("Dog is eating.");
    }
}
class Babydog1 extends Dog2 {
        public static void main(String[] args) {
            Animal7 a1=new Babydog1();
            a1.eat();
        }

    }

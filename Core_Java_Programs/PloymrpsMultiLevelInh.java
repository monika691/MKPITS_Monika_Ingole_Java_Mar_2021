/*Java Runtime Polymorphism with Multilevel Inheritance

 */
package com.mkpits.java.polymorphism;

class Animal6{
    void eat()
    {
        System.out.println("Eating...");
    }
}
class Dog1 extends Animal6{
    void eat()
    {
        System.out.println("Eating bread..");
    }
}
class Babydog extends Dog1{
    void eat()
    {
        System.out.println("Eating fruits..");
    }
}
public class PloymrpsMultiLevelInh {
    public static void main(String[] args) {
        Animal6 a1, a2, a3;
        a1 = new Animal6();
        a2 = new Dog1();
        a3 = new Babydog();

        a1.eat();
        a2.eat();
        a3.eat();
    }
}

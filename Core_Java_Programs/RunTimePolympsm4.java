/*Java Runtime Polymorphism Example: Animal

 */
package com.mkpits.java.polymorphism;


class Animal1{
    void eat()
    {
        System.out.println("Eating..");
    }
}
class Dog extends Animal1{
    void eat() {
        System.out.println(" Eating bread");
    }
}
class Cat extends Animal1{
    void eat() {
        System.out.println(" Eating rat");
    }
}
class Lion extends Animal1{
    void eat() {
        System.out.println(" Eating meat");
    }
}
public class RunTimePolympsm4 {
    public static void main(String[] args) {
        Animal1 a;
        a=new Dog();
        a.eat();
        a=new Cat();
        a.eat();
        a=new Lion();
        a.eat();
    }
}

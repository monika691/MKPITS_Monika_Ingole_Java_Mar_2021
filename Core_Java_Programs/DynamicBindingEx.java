/*Example of dynamic binding

 */
package com.mkpits.java.dynamicbinding;

class Animal{
    void eat()
    {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void eat()
    {
        System.out.println("dog is eating");
    }
}
public class DynamicBindingEx {
    public static void main(String[] args) {
        Animal a =new Dog();
        a.eat();
    }
}

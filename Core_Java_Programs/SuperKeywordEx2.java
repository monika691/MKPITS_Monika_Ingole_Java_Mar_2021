/*2) super can be used to invoke parent class method
it is used if method is overridden
 */
package com.mkpits.java.superkeyword;

class Animal2{
    void eat()
    {
        System.out.println("Eating");
    }
}
class Dog2 extends Animal2{
    void eat()
    {
        System.out.println("eating bread");
    }
    void bark()
    {
        System.out.println("dog is barking");
    }
    void work()
    {
        super.eat();
        bark();
    }
}
public class SuperKeywordEx2 {
    public static void main(String[] args) {
        Dog2 d=new Dog2();
        d.work();
    }
}

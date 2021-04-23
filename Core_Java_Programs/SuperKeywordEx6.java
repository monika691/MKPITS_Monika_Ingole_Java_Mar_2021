/* Another example of super keyword where super() is provided by the compiler implicitly.
example of automatically added super or this keyword
 */
package com.mkpits.java.superkeyword;

class Animal4{
    Animal4()
    {
        System.out.println("Animal is created ");
    }
}
class Dog4 extends Animal4{
    Dog4()
    {
        System.out.println("Dog is created ");
    }
}
public class SuperKeywordEx6 {
    public static void main(String[] args) {
        Dog4 d=new Dog4();
    }
}

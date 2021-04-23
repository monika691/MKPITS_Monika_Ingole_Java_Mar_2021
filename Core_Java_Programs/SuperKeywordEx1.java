/*1) super is used to refer immediate parent class instance variable.

 */
package com.mkpits.java.superkeyword;

class Animal1{
    String color = "white";
}
class Dog1 extends Animal1{
    String color = "Brown";
    void printcolor()
    {
        System.out.println(super.color);
    }
}
class Babydog1 extends Dog1{
    String color ="black";
    void printcolor1()
    {
        System.out.println(color);
        System.out.println(super.color);
        printcolor();
    }
}
public class SuperKeywordEx1 {
    public static void main(String[] args) {
        Babydog1 b = new Babydog1();
        b.printcolor1();
    }
}

package com.mkpits.java.superkeyword;
class Animal{
    String color = "White";
}
class Dog extends Animal{
    String color =" Brown";
    void printcolor()
    {
        System.out.println(color);//print dog color
        System.out.println(super.color);//print parent class class
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.printcolor();
    }
}

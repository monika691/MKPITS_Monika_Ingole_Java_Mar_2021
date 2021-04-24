package com.mkpits.java.abstractexample;
abstract class Bike1{
    Bike1(){System.out.println("bike is created");}
    abstract void run();//abstract method
    void changegear(){System.out.println("gear created");}
}
// creat child class which inherits abstract class
class Honda1 extends Bike1{
    void run()
    {
        System.out.println("running safetly");
    }
}//creat class which callling abstrct and non abstract method
public class AbstractEx4 {
    public static void main(String[] args) {
        Bike1 b=new Honda1();
        b.run();
        b.changegear();
    }
}

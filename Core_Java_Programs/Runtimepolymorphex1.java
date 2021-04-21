/*creating two classes Bike and Splendor. Splendor class extends Bike class and overrides its run() method.
We are calling the run method by the reference variable of Parent class.

 */
package com.mkpits.java.polymorphism;

class Bike{
    void run()
    {
        System.out.println("bike is running ");
    }
}
class splendor extends Bike{
    void run()
    {
        System.out.println("splendor is ruuning 60 km");
    }
}
public class Runtimepolymorphex1 {
    public static void main(String[] args) {
        Bike b;
        b=new splendor(); //upcasting
        b.run();
    }
}

/*Example of Abstract class that has an abstract method

In this example, Bike is an abstract class that contains only one abstract method run.
Its implementation is provided by the Honda class.
 */

package com.mkpits.java.abstractexample;

 abstract class Bike{
    abstract  void run(); //abstract method
}
class Honda extends Bike{
     void run()
     {
         System.out.println("bike is running");
     }
}
public class AbstractEx {
    public static void main(String[] args) {
        Bike b= new Honda();
        b.run();
    }
}

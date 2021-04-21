/*example of hiearchical inheritance

 */
package com.mkpits.java.methodoverriding;


class vehicle{
    void run(){
        System.out.println("vehicle is running");
    }
}
class Bike extends vehicle{
    void run(){
        System.out.println("bike is running safetly");
    }
}
class Car extends vehicle{
    void run(){
        System.out.println("car is running safetly");
    }
}
 public class overridingex2 {
    public static void main(String[] args) {
        Bike b =new Bike();
        b.run();
        //calling method with child class instance
        Car c= new Car();
        c.run();
    }
}

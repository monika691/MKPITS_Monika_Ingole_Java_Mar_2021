package com.mkpits.java.methodoverriding;


class Vehicle{
    void run(){
        System.out.println("vehicle is running");
    }
}
class bike extends Vehicle
        { void run() {
            System.out.println("bike is running safely");
        }
        }
public class vehicleex {
    public static void main(String[] args) {
        bike b=new bike();
        b.run();
    }
}

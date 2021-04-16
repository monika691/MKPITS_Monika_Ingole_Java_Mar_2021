package com.mkpits.java.basicprograms;
import java.util.*;
class CarEx {
    static class Car {
        String color;
        long make;
        String brand;

        void getdata(String c, long m, String b) {
            color = c;
            make = m;
            brand = b;
        }

        void showdata() {
            System.out.println("car color " + color);
            System.out.println("car make " + make);
            System.out.println("car brand " + brand);
        }
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        Car c1=new Car();
        System.out.println("Enter car color,make year and brand");
        String c = sc.next();
        long m = sc.nextLong();
        String b = sc.next();
        c1.getdata(c, m, b);
        c1.showdata();
    }
}

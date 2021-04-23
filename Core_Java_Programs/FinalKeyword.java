package com.mkpits.java.finalkeyword;

class Bike{
   final int speedlimit;
   Bike()
   {
       speedlimit =20;
   }
   void run()
   {
       System.out.println(speedlimit);
   }
}
public class FinalKeyword {
    public static void main(String[] args) {
        Bike b =new Bike();
        b.run();
    }
}

package com.mkpits.java.finalkeyword;

class Bike1 {
     final int speedlimit;
    Bike1()
    {
        speedlimit = 70;
        System.out.println(speedlimit);
    }
}
public class FinalKeywordEx1 {
    public static void main(String[] args) {
        new Bike1();
    }
}

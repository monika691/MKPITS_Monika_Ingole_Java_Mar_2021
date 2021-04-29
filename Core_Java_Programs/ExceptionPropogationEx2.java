package com.mkpits.java.exceptionpropogation;

public class ExceptionPropogationEx2 {
    void m(){
        int data=50/0;
    }
    void n(){
        m();
    }
    void p(){
        n();
    }


    public static void main(String[] args) {
        ExceptionPropogationEx2 obj = new ExceptionPropogationEx2();
        try {
            obj.p();
        } catch (Exception e) {
            System.out.println("exception handeled");
        }
        System.out.println("normal flow");
    }
}

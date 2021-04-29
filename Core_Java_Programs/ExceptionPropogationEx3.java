package com.mkpits.java.exceptionpropogation;

public class ExceptionPropogationEx3 {
    void m() {
        try {
            int data = 50 / 0;
        } catch (Exception ee) {
            System.out.println("exception handeled m");
        }
    }
        void n(){
            m();
        }
        void p(){
            n();
        }

    public static void main(String[] args) {
        ExceptionPropogationEx3 obj=new ExceptionPropogationEx3();
        try {
            obj.p();
        }catch (Exception e){
            System.out.println("exception handled");
        }
            System.out.println("normal flow");
    }
}

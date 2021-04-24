package com.mkpits.java.sb;
interface Printable2{
    void print();
}
interface Showable1{
    void print();
}

 class InterfaceEx5 implements Printable2,Showable1 {
    public void print() {System.out.println("Hello");}
    public static void main(String[] args) {
        InterfaceEx5 i = new InterfaceEx5();
        i.print();
    }
}
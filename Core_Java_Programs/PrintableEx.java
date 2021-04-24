package com.mkpits.java.sb;
interface Printable{
    int MIN=5;
    void print();
}

public class PrintableEx implements Printable{
    public void print() {
        System.out.println(" min " + MIN);
    }

    public static void main(String[] args) {
        Printable p=new PrintableEx();
        p.print();
    }
}

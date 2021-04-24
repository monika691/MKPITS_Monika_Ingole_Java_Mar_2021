package com.mkpits.java.sb;
interface Printable4{
    void print();
}
interface MessagePrintable{
    void msg();
}
abstract class example implements Printable4,MessagePrintable{
    public void print(){System.out.println("print");}
    public void msg(){System.out.println("msg");}
}
public class InterfaceEx9 extends example {
    public static void main(String[] args) {
      example e = new InterfaceEx9();
      e.print();
      e.msg();
    }
}

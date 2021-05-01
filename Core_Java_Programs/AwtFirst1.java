package com.mkpits.java;
import java.awt.*;
public class AwtFirst1 extends Frame {
    AwtFirst1() {
        Frame f = new Frame();
        TextField t = new TextField();
        t.setBounds(10, 40, 240, 25);
        f.add(t);
        Button b1 = new Button("(");
        Button b2 = new Button(")");
        Button b3 = new Button("%");
        Button b4 = new Button("AC");
        Button b5 = new Button("7");
        Button b6 = new Button("8");
        Button b7 = new Button("9");
        Button b8 = new Button("/");
        Button b9 = new Button("4");
        Button b10 = new Button("5");
        Button b11 = new Button("6");
        Button b12 = new Button("*");
        Button b13 = new Button("1");
        Button b14 = new Button("2");
        Button b15 = new Button("3");
        Button b16 = new Button("-");
        Button b17 = new Button("0");
        Button b18 = new Button(".");
        Button b19 = new Button("=");
        Button b20 = new Button("+");

        b1.setBounds(10, 50, 80, 50);
        f.add(b1);
        b2.setBounds(90, 50, 80, 50);
        f.add(b2);
        b3.setBounds(170, 50, 80, 50);
        f.add(b3);
        b4.setBounds(250, 50, 80, 50);
        f.add(b4);
        b5.setBounds(10, 100, 80, 50);
        f.add(b5);
        b6.setBounds(90, 100, 80, 50);
        f.add(b6);
        b7.setBounds(170, 100, 80, 50);
        f.add(b7);
        b8.setBounds(250, 100, 80, 50);
        f.add(b8);
        b9.setBounds(10, 150, 80, 50);
        f.add(b9);
        b10.setBounds(90, 150, 80, 50);
        f.add(b10);
        b11.setBounds(170, 150, 80, 50);
        f.add(b11);
        b12.setBounds(250, 150, 80, 50);
        f.add(b12);
        b13.setBounds(10, 200, 80, 50);
        f.add(b13);
        b14.setBounds(90, 200, 80, 50);
        f.add(b14);
        b15.setBounds(170, 200, 80, 50);
        f.add(b15);
        b16.setBounds(250, 200, 80, 50);
        f.add(b16);
        b17.setBounds(10, 250, 80, 50);
        f.add(b17);
        b18.setBounds(90, 250, 80, 50);
        f.add(b18);
        b19.setBounds(170, 250, 80, 50);
        f.add(b19);
        b20.setBounds(250, 250, 80, 50);
        f.add(b20);

        f.setSize(260, 300);
        f.setTitle("Calculator");
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        AwtFirst1 f = new AwtFirst1();
    }
}

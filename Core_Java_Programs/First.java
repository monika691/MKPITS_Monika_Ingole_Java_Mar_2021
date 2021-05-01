package com.mkpits.java.awt;
import java.awt.*;
class First extends Frame{
    First(){
        Button b=new Button("click me");
        b.setBounds(100,100,40,40);
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        First f=new First();
    }
}

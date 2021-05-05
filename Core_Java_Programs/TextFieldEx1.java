/*Java AWT TextField Example

 */
package com.mkpits.java.textfield;
import java.awt.*;
import java.awt.event.ActionListener;

public class TextFieldEx1 {
    public static void main(String[] args) {
        Frame f=new Frame("textfield example");
        TextField t1,t2;
        t1=new TextField("welcome");
        t1.setBounds(50,100,200,30);
        t2=new TextField("Awt tutorial");
        t2.setBounds(50,150,200,30);
        f.add(t1);f.add(t2);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }
    }


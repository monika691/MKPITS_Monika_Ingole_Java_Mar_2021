/*keyevent program

 */
package com.mkpits.java.adapter;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyevent extends Frame implements KeyListener {
    TextField tf;
    public Keyevent() {
        Label l=new Label("Chrachter enter");
        l.setBounds(50,100,130,20);
        add(l);

        tf=new TextField(20);
        tf.addKeyListener(this);
        tf.setBounds(180,100,130,20);
        add(tf);
        setLayout(null);
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        Keyevent ke=new Keyevent();
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("recently type in textifield are : " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
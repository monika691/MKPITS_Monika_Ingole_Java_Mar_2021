/*1 - create a ui with 2 button and do event handling

 */
package com.mkpits.java.eventhandling;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlingEx1 extends Frame implements ActionListener {
    Button b, b1;
    Label l1;//for non editable text

    EventHandlingEx1() {
        b = new Button("button 1");
        b.setBounds(100, 100, 100, 25);
        b.addActionListener(this);
        add(b);

        b1 = new Button("button 2");
        b1.setBounds(100, 200, 100, 25);
        b1.addActionListener(this);
        add(b1);

        l1 = new Label("status");
        l1.setBounds(50, 250, 200, 50);
        add(l1);

        setLayout(null);
        setSize(300, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b) {
            System.out.println("button 1 is clicked");
            l1.setText("button 1 clicked");
        }

        if (ae.getSource() == b1) {
            System.out.println("button 2 is clicked");
            l1.setText("button 2 clicked");
        }
    }

    public static void main(String[] args) {
        EventHandlingEx1 e = new EventHandlingEx1();
    }
}
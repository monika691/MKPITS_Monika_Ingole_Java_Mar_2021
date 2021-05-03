/*example with 2 buttons

 */
package com.mkpits.java.eventhandling;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlingEx6 extends Frame{
    EventHandlingEx6(){
        TextField t=new TextField();
        t.setBounds(60,50,170,20);
        Button b=new Button("clicked me");
        b.setBounds(100,120,80,30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText("welcome");
            }
        });

        Button b1=new Button("clear");
        b1.setBounds(100,160,80,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText(" ");
            }
        });
        add(b);add(t);add(b1);
        setLayout(null);
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
EventHandlingEx6 e=new EventHandlingEx6();
    }
}

/*4- example of event handling with anonymous class.

 */
package com.mkpits.java.eventhandling;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlingEx4 extends Frame {
    Button b,b1;
    Label l; // used for non editable text
    EventHandlingEx4(){
        b=new Button("button 1");
        b.setBounds(100,100,100,25);
        //event handling with anonyms class
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l.setText("button 1 is clicked");
            }
        });
        add(b);

        b1=new Button("button 2");
        b1.setBounds(100,200,100,25);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l.setText("button 2 is clicked");
                            }
        });
        add(b1);

        l=new Label("status");
        l.setBounds(50,250,200,50);
        add(l);

        setLayout(null);
        setSize(300,300);
        setVisible(true);

    }

    public static void main(String[] args) {
        EventHandlingEx4 e1=new EventHandlingEx4();
    }
}

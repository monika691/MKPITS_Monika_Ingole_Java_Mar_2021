/*another program to accept 2 no. from the user and display the additon of 2 no.

 */
package com.mkpits.java.eventhandling;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventhandlingEx7 extends Frame {
    EventhandlingEx7(){
        Label l1=new Label("enter no1");
        l1.setBounds(10,40,240,25);
        add(l1);

        TextField t=new TextField();
        t.setBounds(260,40,240,25);
        add(t);

        Label l2=new Label("enter no2");
        l2.setBounds(10,70,240,25);
        add(l2);

        TextField t1=new TextField();
        t1.setBounds(260,70,240,25);
        add(t1);

        Label l3=new Label("result");
        l3.setBounds(10,40,240,25);
        add(l3);

        TextField t2=new TextField();
        t2.setBounds(260,40,240,25);
        add(t2);

        Button b=new Button("Addition");
        b.setBounds(100,100,80,20);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str=t.getText();
                double fn=Double.parseDouble(str);
                double sn=Double.parseDouble(t1.getText());

                t2.setText("sum is " + (fn+sn));
            }
        });
         add(b);
         setLayout(null);
         setSize(300,300);
         setVisible(true);
    }

    public static void main(String[] args) {
        EventhandlingEx7 e=new EventhandlingEx7();
    }
}

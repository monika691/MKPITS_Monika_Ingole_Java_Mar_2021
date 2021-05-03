/*3-  example of event handling in outside class

 */
package com.mkpits.java.eventhandling;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 class EventEx3 extends Frame {
    Button b,b1;
    Label l;
    EventEx3(){
        b=new Button("button 1");
        b.setBounds(100,100,100,25);
        outer out=new outer(this);
        b.addActionListener(out);
        add(b);

        l=new Label("status");
        l.setBounds(50,250,200,50);
        add(l);

        setLayout(null);
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        EventEx3 e1=new EventEx3();
    }
}
class outer implements ActionListener{
    EventEx3 e1;
    outer(EventEx3 e1){
        this.e1=e1;
    }
    public void actionPerformed(ActionEvent ae){
        e1.l.setText("button 1 is clicked");
    }
}
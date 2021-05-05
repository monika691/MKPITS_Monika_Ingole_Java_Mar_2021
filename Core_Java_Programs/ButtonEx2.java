/*Java AWT Button Example with ActionListener

 */
package com.mkpits.java.buttonexample;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEx2 {
    public static void main(String[] args) {
        Frame f=new Frame("Button Example1");
        TextField t=new TextField();
        t.setBounds(50,50,150,30);

        Button b=new Button("clicked here");
        b.setBounds(50,200,150,30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText("welcom to java language");
            }
        });
        f.add(b);f.add(t);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }
}

/*Java AWT Choice Example with ActionListener
 */
package com.mkpits.java.choice;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceEx2 {
    ChoiceEx2(){
        Frame f=new Frame();
        final Label l=new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(400,100);

        Button b=new Button("shop");
        b.setBounds(200,100,50,20);
        final Choice c=new Choice();
        c.setBounds(100,100,75,75);
        c.add("C");
        c.add("C++");
        c.add("Java");
        c.add("Php");
        c.add("Android");
        f.add(l);f.add(b);f.add(c);
        f.setLayout(null);
        f.setSize(400,100);
        f.setVisible(true);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data="Programming language selected : " +c.getItem(c.getSelectedIndex());
                             l.setText(data);
            }
        });

    }

    public static void main(String[] args) {
        new ChoiceEx2();
    }
}

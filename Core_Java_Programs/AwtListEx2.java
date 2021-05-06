/*Java AWT List Example with ActionListener
 */
package com.java.mkpits;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwtListEx2 {
    AwtListEx2(){
        Frame f=new Frame();
        final Label l=new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(400,100);

        Button b=new Button("show");
        b.setBounds(200,150,50,30);
        f.add(b);

        final List l1=new List(4,false);
        l1.setBounds(80,100,100,80);
        l1.add("C");
        l1.add("C++");
        l1.add("Php");
        l1.add("Java");

        final List l2=new List(4,true);
        l2.setBounds(80,200,100,80);
        l2.add("Turbo");
        l2.add("intellij");
        l2.add("hibernate");
        l2.add("Spring");
        f.add(l);f.add(l1);f.add(l2);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data=" programming language selected : " +l1.getItem(l1.getSelectedIndex());
                data+=" Framework selected ";
                for(String frame: l2.getSelectedItems()){
                    data += frame +"";
                    l.setText(data);
                }

            }
        });
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);


    }

    public static void main(String[] args) {
        new AwtListEx2();
    }
}

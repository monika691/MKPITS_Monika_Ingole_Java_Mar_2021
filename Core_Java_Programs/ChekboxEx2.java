/*Java AWT Checkbox Example with ItemListener
 */
package com.mkpits.java.itemlistner;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChekboxEx2 {
    ChekboxEx2() {
       Frame f=new Frame("checkbox example");
       final Label l=new Label();
       l.setAlignment(Label.CENTER);
       l.setSize(400,100);
       Checkbox cb1=new Checkbox("c++");
       cb1.setBounds(100,100,50,50);
       Checkbox cb2=new Checkbox("java",true);
       cb2.setBounds(100,150,50,50);
       f.add(l);f.add(cb1);
       f.add(cb2);
       cb1.addItemListener(new ItemListener() {
           @Override
           public void itemStateChanged(ItemEvent e) {
               l.setText("c++ checkbox : " +(e.getStateChange()==1?"checked" : "uncheked"));
           }
       });
       cb2.addItemListener(new ItemListener() {
           @Override
           public void itemStateChanged(ItemEvent e) {
               l.setText("java checkbox : " + (e.getStateChange()==1?"checked " : "unchecked"));
           }
       });
       f.setLayout(null);
       f.setSize(400,100);
       f.setVisible(true);

    }

    public static void main(String[] args) {
        new ChekboxEx2();
    }

}

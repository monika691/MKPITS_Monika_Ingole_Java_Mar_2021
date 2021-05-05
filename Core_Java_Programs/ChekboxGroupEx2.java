/*Java AWT CheckboxGroup Example with ItemListener

 */
package com.mkpits.java.checkboxgroup;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChekboxGroupEx2 {
    ChekboxGroupEx2(){
        Frame f=new Frame("checkboxgroup example");
        Label l=new Label("register yourself");
        l.setAlignment(Label.CENTER);
        l.setSize(400,100);

        CheckboxGroup cbg=new CheckboxGroup();
        Checkbox cb1=new Checkbox("c++",cbg,false);
        cb1.setBounds(100,100,50,50);
        Checkbox cb2=new Checkbox("Java",cbg,true);
        cb2.setBounds(100,150,50,50);
        f.add(cb1);
        f.add(cb2);
        f.setLayout(null);
        f.setSize(300,300);
        f.setVisible(true);
        cb1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                l.setText("c++ checkbox : checked");
            }
        });
        cb2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                l.setText("Java checkbox : checked");
            }
        });
    }

    public static void main(String[] args) {
        new ChekboxGroupEx2();
    }
}

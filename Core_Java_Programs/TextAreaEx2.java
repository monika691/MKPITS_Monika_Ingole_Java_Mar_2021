/*Java AWT TextArea Example with ActionListener
 */
package com.mkpits.java.textarea;
import com.mkpits.java.textfield.TextFieldEx2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;

public class TextAreaEx2 extends Frame implements ActionListener {
    Label l1, l2;
    TextArea area;
    Button b;

    TextAreaEx2() {
        l1 = new Label();
        l1.setBounds(50, 50, 100, 30);
        l2 = new Label();
        l2.setBounds(160, 50, 100, 30);
        area = new TextArea();
        area.setBounds(20, 100, 300, 300);
        b = new Button("count words");
        b.setBounds(100, 400, 100, 30);
        b.addActionListener(this);
        add(l1);
        add(l2);
        add(b);
        add(area);
        setLayout(null);
        setSize(300, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
      String text=area.getText();
      String words[]=text.split("\\s");
      l1.setText("words"+words.length);
      l2.setText("character" +text.length());
    }

    public static void main(String[] args) {
        new TextAreaEx2();
    }
}
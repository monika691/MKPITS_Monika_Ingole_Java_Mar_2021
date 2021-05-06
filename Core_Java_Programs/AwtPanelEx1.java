/*Java AWT Panel Example

 */
package com.java.mkpits;

import java.awt.*;

public class AwtPanelEx1 {
    AwtPanelEx1(){
        Frame f=new Frame();
        Panel p=new Panel();
        p.setBounds(100,100,200,150);
        p.setBackground(Color.gray);
        Button b=new Button("Save");
        b.setBounds(170,80,50,20);
        b.setBackground(Color.green);
        Button b1=new Button("delete");
        b1.setBounds(200,80,50,20);
        b1.setBackground(Color.green);
        p.add(b);p.add(b1);
        f.add(p);

        f.add(p);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new AwtPanelEx1();
    }
}

/*Java AWT Panel Example2

 */
package com.java.mkpits;

import java.awt.*;

public class AwtPanelEx2 {
    AwtPanelEx2(){
        Frame f=new Frame();
        Panel p=new Panel();
        p.setBounds(50,100,200,200);
        p.setBackground(Color.cyan);
        Button b1=new Button("Save");
        b1.setBounds(250,100,100,50);
        b1.setBackground(Color.pink);
        Button b2=new Button("delete");
        b2.setBounds(350,100,100,50);
        b2.setBackground(Color.pink);
        p.add(b1);
        p.add(b2);

        Panel p1=new Panel();
        p1.setBounds(50,450,200,200);
        p1.setBackground(Color.gray);
        Button b3=new Button("Open");
        b3.setBounds(250,100,200,200);
        b3.setBackground(Color.green);
        Button b4=new Button("close");
        b4.setBounds(450,100,200,200);
        b4.setBackground(Color.green);

        p1.add(b3);
        p1.add(b4);
        f.add(p);
        f.add(p1);
        f.setLayout(null);
        f.setSize(500,800);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new AwtPanelEx2();
    }
}

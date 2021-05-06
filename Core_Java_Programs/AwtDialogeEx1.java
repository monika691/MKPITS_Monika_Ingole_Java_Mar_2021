/*Java AWT Dialog Example

 */
package com.java.mkpits;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwtDialogeEx1 {
    private static Dialog d;
    AwtDialogeEx1() {
        Frame f=new Frame();
        d=new Dialog(f,"Dialog example,true");
        d.setLayout(new FlowLayout());
        Button b=new Button("ok");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AwtDialogeEx1.d.setVisible(false);
            }
        });
        d.add(new Label("click button to continue"));
        d.add(b);
        d.setSize(400,400);
        d.setVisible(true);
    }

    public static void main(String[] args) {
        new AwtDialogeEx1();
    }
}

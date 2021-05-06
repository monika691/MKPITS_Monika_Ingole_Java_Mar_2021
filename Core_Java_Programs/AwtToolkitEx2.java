/*Java AWT Toolkit Example: beep()

 */
package com.java.mkpits;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwtToolkitEx2 {
    public static void main(String[] args) {
        Frame f=new Frame("beep example");
        Button b=new Button("beep");
        b.setBounds(50,150,100,20);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Toolkit.getDefaultToolkit().beep();
            }
        });
        f.add(b);
        f.setLayout(null);
        f.setSize(300,300);
        f.setVisible(true);
    }
}

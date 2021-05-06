/*Java AWT PopupMenu Example

 */
package com.java.mkpits;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AwtPopupEx1 {
    AwtPopupEx1(){
        Frame f=new Frame("Popup Example");
        final PopupMenu pm=new PopupMenu("Edit");
        MenuItem cut=new MenuItem("cut");
        cut.setActionCommand("cut");
        MenuItem copy=new MenuItem("copy");
        copy.setActionCommand("copy");
        MenuItem paste=new MenuItem("paste");
        paste.setActionCommand("paste");
        pm.add(cut);
        pm.add(copy);
        pm.add(paste);

        f.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pm.show(f, e.getX(), e.getY());
            }
        });
        f.add(pm);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new AwtPopupEx1();
    }
}

/*window closing program

 */
package com.mkpits.java.adapter;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdapterEx2 extends Frame {
    AdapterEx2(){
        addMouseListener(new myMouseAdapter1(this));
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        AdapterEx2 ad=new AdapterEx2();
    }
}
class myMouseAdapter1 extends MouseAdapter{
    AdapterEx2 ad;
    myMouseAdapter1(AdapterEx2 ad){
        this.ad=ad;
    }
    public void mouseClicked(MouseEvent me){
        System.out.println("mouse clicked");
    }
}

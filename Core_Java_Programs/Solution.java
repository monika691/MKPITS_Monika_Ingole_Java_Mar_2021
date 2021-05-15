/*// java Program to create a simple JInternalFrame

 */
package com.mkpits.java.internalframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Solution extends JFrame {
    static JFrame f;
    static JLabel l;

    public static void main(String[] args) {
        //creating frame
        f=new JFrame("Internal Frame");

        //creating internal frame

        JInternalFrame in=new JInternalFrame();

        //set title for frame
        in.setTitle("internal frame");

        //creating panel
         JPanel p=new JPanel();

         //creating button
         JButton b=new JButton("Button");

         //creating label
         l=new JLabel("this is internal frame");

         //adding label in panel
         p.add(l);

        //aading button in panel
        p.add(b);


        //adding panel in internal frame
         in.add(p);

         //adding internal frame in frame
         f.add(in);


         in.setVisible(true);
        f.setSize(300,300);

         f.show();

    }
}

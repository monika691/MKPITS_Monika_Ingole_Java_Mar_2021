/*3 . Program to create multiple frame and set icon to the frame
// java Program to create multiple frame and set icon to the frame
 */

package com.mkpits.java.internalframe;
import java.awt.Event.*;
import javax.swing.*;
import java.awt.*;

public class solution2 extends JFrame {
    static JFrame f;
    static JLabel l;

    public static void main(String[] args) {
        //create frames
        f=new JFrame("INTERNAL FRAME");

        //set frame layout

        f.setLayout(new FlowLayout());

        //create Internal Frame

        JInternalFrame in=new JInternalFrame("Frame 1",true,true,true,true);
        JInternalFrame in1=new JInternalFrame("Frame 2",true,true,true,true);

        //set icon for internal frame
        in.setFrameIcon(new ImageIcon("e:/crop.jpg"));
        in1.setFrameIcon(new ImageIcon("e:/crop.jpg"));

        //create panel
        JPanel p=new JPanel();
        JPanel p1=new JPanel();

        //create buttons
        JButton b=new JButton("Button");
        JButton b1=new JButton("Button");

        //Create labels
        l=new JLabel("this is internal frame 1");
        JLabel l1=new JLabel("this is internal frame 2");

        //adding button and label in panel
        p.add(b);
        p.add(l);

        //adding button and label in panel
        p1.add(b1);
        p1.add(l1);

        //adding panel in internal frame
        in.add(p);
        in1.add(p1);

        //adding internal frame in frame
        f.add(in);
        f.add(in1);

        in.setVisible(true);
        in1.setVisible(true);

        f.setSize(300,300);
        f.show();



    }
}

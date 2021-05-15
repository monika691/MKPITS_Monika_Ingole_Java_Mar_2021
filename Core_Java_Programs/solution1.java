/*//2. program to create multiple internal frames

 */
package com.mkpits.java.internalframe;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class solution1 extends JFrame{
    static JFrame f;
    static JLabel l;

    public static void main(String[] args) {
        //creat frame
        f=new JFrame("Internal Frame");

        f.setLayout(new FlowLayout());

        //creat internal frame

        JInternalFrame in= new JInternalFrame("Frame 1",true,true,true,true);

        JInternalFrame in1=new JInternalFrame("Frame 2",true,true,true,true);

        // set title of internal frame
        in.setTitle("Internal frame");
        in1.setTitle("Internal frame");

        //create panel
        JPanel p=new JPanel();
        JPanel p1=new JPanel();

        //creat Button
        JButton b=new JButton("Button");
        JButton b1=new JButton("Button");

        //creat label

        JLabel l=new JLabel("this is internal frame 1 ");
        JLabel l1=new JLabel("this is internal frame 2");

        //adding label and button in panel1
        p1.add(b1);
        p1.add(l1);

        // adding label and button in panel
        p.add(b);
        p.add(l);

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

/*wrp of area nd circumference grade details using awt

 */

package com.mkpits.java.awtswing;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
public class AwtRadiusEx {
    AwtRadiusEx(){
        JFrame f=new JFrame();
        JLabel l1=new JLabel("enter radius");
        l1.setBounds(10,50,80,20);
        f.add(l1);
        JTextField tf=new JTextField();
        tf.setBounds(80,50,80,20);
        f.add(tf);

        Checkbox cb1=new Checkbox("Area");
        cb1.setBounds(10,100,80,20);
        f.add(cb1);
        Checkbox cb2=new Checkbox("circumference ",true);
        cb2.setBounds(90,100,180,20);
        f.add(cb2);

        JLabel l2=new JLabel("info : ");
        l2.setBounds(50,200,250,30);
        f.add(l2);

        JButton b=new JButton("Result");
        b.setBounds(20,150,100,20);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb=new StringBuilder();
                float area,circumference;
                int radius=Integer.parseInt(tf.getText());
                area=3.14f*radius*radius;
                circumference=2*3.14f*radius;

                 if(cb1.getState()==true) {
                    area = 3.14f * radius * radius;
                    sb.append("Area is : " + area);
                }
                 if(cb2.getState()==true) {
                     circumference = 2 * 3.14f * radius;
                     sb.append(" Circumference is : " + circumference);
                 }
                 l2.setText(sb.toString());
            }
        });
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AwtRadiusEx();
    }
}

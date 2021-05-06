/*wrp of factorial  details using awt

 */

package com.mkpits.java.awtswing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwtFactEx {
    AwtFactEx(){
        JFrame f=new JFrame();
        JLabel l1=new JLabel("enter number");
        l1.setBounds(10,50,100,30);
        f.add(l1);

        JTextField tf=new JTextField();
        tf.setBounds(100,50,100,30);
        f.add(tf);

        JLabel l2=new JLabel("Factorial");
        l2.setBounds(50,150,100,30);
        f.add(l2);

        JButton b=new JButton("Result");
        b.setBounds(100,120,100,20);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb=new StringBuilder();
                int fact=1;
                int a=Integer.parseInt(tf.getText());
                for(int i=1;i<=a;i++){
                    fact=fact*i;
                }l2.setText("factorial is : " + fact);
            }
        });
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AwtFactEx();
    }
}

/*wrp of vowel details using awt

 */
package com.mkpits.java.awtswing;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class AwtVowelEx {
    AwtVowelEx(){
        JFrame f=new JFrame();
        JLabel l1=new JLabel("enter character");
        l1.setBounds(10,50,100,20);
        f.add(l1);
        JTextField tf=new JTextField();
        tf.setBounds(110,50,80,20);
        f.add(tf);
        
        JLabel l2=new JLabel("info : ");
        l2.setBounds(10,150,150,20);
        f.add(l2);
        
        JButton b=new JButton("Vowel or not");
        b.setBounds(10,100,150,20);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb=new StringBuilder();
                String n= tf.getText();
                char ch=n.charAt(0);

                if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
                    {
                    sb.append("chracter is vowel : " +ch);
                }

                else {
                    sb.append("not a vowel ");
                }

                l2.setText(sb.toString());
            }
        });
        f.setLayout(null);
        f.setSize(300,300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AwtVowelEx();
    }
}

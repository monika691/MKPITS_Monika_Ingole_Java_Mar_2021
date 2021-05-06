/*wrp of total percentage grade details using awt

 */
package com.mkpits.java.awtswing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwtSubTpgEx {
    AwtSubTpgEx(){
        JFrame f=new JFrame("Report Card");
        JLabel l1=new JLabel("roll no");
        l1.setBounds(10,50,50,20);
        f.add(l1);

        JLabel l2=new JLabel("Sub 1");
        l2.setBounds(10,100,50,20);
        f.add(l2);

        JLabel l3=new JLabel("Sub 2");
        l3.setBounds(10,150,50,20);
        f.add(l3);

        JLabel l4=new JLabel("Sub 3");
        l4.setBounds(10,200,50,20);
        f.add(l4);

        JTextField tf1=new JTextField();
        tf1.setBounds(60,50,50,20);
        f.add(tf1);

        JTextField tf2=new JTextField();
        tf2.setBounds(60,100,50,20);
        f.add(tf2);

        JTextField tf3=new JTextField();
        tf3.setBounds(60,150,50,20);
        f.add(tf3);

        JTextField tf4=new JTextField();
        tf4.setBounds(60,200,50,20);
        f.add(tf4);

        JTextArea a=new JTextArea("info : ");
        a.setBounds(10,300,350,100);
        f.add(a);

        JButton b=new JButton("Result");
        b.setBounds(80,250,80,30);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb=new StringBuilder();

                int Sub1=Integer.parseInt(tf2.getText());
                int Sub2=Integer.parseInt(tf3.getText());
                int Sub3=Integer.parseInt(tf4.getText());
                int rollno=Integer.parseInt(tf1.getText());
                sb.append("rollno is :" +tf1.getText()+ "\n");
                int total;
                    total = (Sub1 + Sub2 + Sub3);
                    sb.append("total : " + total + "\n");

                    float per = (total / 300.0f) * 100.0f;
                    sb.append("Percentage : " + per + "\n");


                if (per>=75){
                    sb.append("Grade : 1st Div" + "\n");
                }
                else if(per <75 && per >=60){
                    sb.append("Grade : 2nd Div");
                }
                else if(per<60 && per >=40){
                    sb.append("Grade : 3rd Div");
                }
                else if(per<40)
                {
                    sb.append("Grade : Fail");
                }
                a.setText(sb.toString());
            }
        });
        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AwtSubTpgEx();
    }
}

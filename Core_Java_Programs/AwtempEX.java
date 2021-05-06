/*wrp of employee details using awt

 */
package com.mkpits.java.awtswing;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class AwtempEX {
    AwtempEX(){
        JFrame f=new JFrame("Employee details");
        JLabel l1=new JLabel("Employee name");
        l1.setBounds(10,50,100,20);
        f.add(l1);

        JTextField tf=new JTextField();
        tf.setBounds(110,50,100,20);
        f.add(tf);

        JLabel l2=new JLabel("Designation");
        l2.setBounds(10,100,100,20);
        f.add(l2);
        Choice c=new Choice();
        c.setBounds(110,100,100,20);
        c.add("Manager");
        c.add("Clerk");
        c.add("Peon");
        f.add(c);

        JLabel l3=new JLabel("Basic salary");
        l3.setBounds(10,150,100,20);
        f.add(l3);

        JTextField tf1=new JTextField();
        tf1.setBounds(110,150,100,20);
        f.add(tf1);

        JTextArea a=new JTextArea("info : ");
        a.setBounds(20,250,550,120);
        f.add(a);

        JButton b=new JButton("Show");
        b.setBounds(80,200,100,20);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int BasicSalary;
                double hra,da;
                double total_salary;
                StringBuilder sb=new StringBuilder();
                BasicSalary=Integer.parseInt(tf1.getText());
                sb.append("employee name is : " +tf.getText()+ "\n");
                String data="Designation selected : " +c.getItem(c.getSelectedIndex());
                a.setText(data);
                sb.append(" Basic salary : " + tf1.getText() + "\n");

                hra=BasicSalary*0.25f;
                sb.append(" hra is : " + hra + "\n");

                da=BasicSalary*0.35f;
                sb.append(" da is : " +da  + "\n" );

                total_salary=hra+da+BasicSalary;
                sb.append(" total salary is : " +total_salary);

                a.setText(sb.toString());
            }
        });
        f.setLayout(null);
        f.setSize(700,500);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AwtempEX();
    }
}

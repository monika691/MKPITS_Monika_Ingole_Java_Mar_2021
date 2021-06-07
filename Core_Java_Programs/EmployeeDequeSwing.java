/*create a collection of employee using arraydeque class in swing.

 */
package com.mkpits.java.collection;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayDeque;
import java.util.Deque;

public class EmployeeDequeSwing extends JFrame {
    JLabel l1,l2,l3,l4;
    JButton b1,b2,b3;
    JTextField tf1,tf2,tf3,tf4;
    JTextArea ta;
    Deque<String> deque=new ArrayDeque<String>();
    EmployeeDequeSwing(){
        l1=new JLabel("Employee id");
        l1.setBounds(10,50,100,30);
        add(l1);
        tf1=new JTextField();
        tf1.setBounds(110,50,100,30);
        add(tf1);

        l2=new JLabel("Employee Name");
        l2.setBounds(10,100,100,30);
        add(l2);
        tf2=new JTextField();
        tf2.setBounds(110,100,100,30);
        add(tf2);

        l3=new JLabel("Designation");
        l3.setBounds(10,150,100,30);
        add(l3);
        tf3=new JTextField();
        tf3.setBounds(110,150,100,30);
        add(tf3);

        l4=new JLabel("Salary");
        l4.setBounds(10,200,100,30);
        add(l4);
        tf4=new JTextField();
        tf4.setBounds(110,200,100,30);
        add(tf4);

        b1=new JButton("Add");
        b1.setBounds(20,250,80,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String emp=new String();
                emp=("id : " + tf1.getText() + "\n"+ "name : " + tf2.getText() + "\n" + "Designation : " + tf3.getText() + "\n" + "salary : " + tf4.getText());
                deque.add(emp);
                tf1.setText(" ");
                tf2.setText(" ");
                tf3.setText(" ");
                tf4.setText(" ");
            }
        });add(b1);

        b2=new JButton("Display");
        b2.setBounds(110,250,80,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb=new StringBuilder();
                for (String Employee : deque){
                    sb.append("details : " + "\n" + Employee );
                    ta.setText(sb.toString());
                }
            }
        });add(b2);

        ta=new JTextArea("Details");
        ta.setBounds(10,300,200,200);
        add(ta);

        setLayout(null);
        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        EmployeeDequeSwing eds=new EmployeeDequeSwing();
    }
}

/*17 - example where we are storing employee class object (empno, empname, designation, salary) in an array list using awt or swing.

 */
package com.mkpits.java.collection;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AwtEmployeeArrayList extends JFrame {
    JLabel l1,l2,l3,l4;
    JTextField tf1,tf2,tf3,tf4;
    JButton b1,b2;
    JTextArea ta;
    ArrayList<String> employee=new ArrayList<String>();
    AwtEmployeeArrayList(){
        l1=new JLabel("Emp no.");
        l1.setBounds(10,50,100,30);
        add(l1);
        tf1=new JTextField();
        tf1.setBounds(110,50,100,30);
        add(tf1);

        l2=new JLabel("Emp Name.");
        l2.setBounds(10,100,100,30);
        add(l2);
        tf2=new JTextField();
        tf2.setBounds(110,100,100,30);
        add(tf2);

        l3=new JLabel("Emp Designation");
        l3.setBounds(10,150,120,30);
        add(l3);
        tf3=new JTextField();
        tf3.setBounds(110,150,100,30);
        add(tf3);

        l4=new JLabel("Emp Salary");
        l4.setBounds(10,200,100,30);
        add(l4);
        tf4=new JTextField();
        tf4.setBounds(110,200,100,30);
        add(tf4);

        b1=new JButton("Add Employee");
        b1.setBounds(30,250,150,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             employee.add(tf1.getText());
             employee.add(tf2.getText());
             employee.add(tf3.getText());
             employee.add(tf4.getText());
             tf1.setText(" ");
             tf2.setText(" ");
             tf3.setText(" ");
             tf4.setText(" ");
            }
        });add(b1);

        b2=new JButton("Display Employee");
        b2.setBounds(190,250,150,30 );
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             StringBuilder sb=new StringBuilder();
             for (String str : employee){
                 sb.append("employee details : " + str + "\n");


                 ta.setText(sb.toString());
             }
            }
        });add(b2);

        ta=new JTextArea("Employee details");
        ta.setBounds(10,300,200,200);
        add(ta);

        setLayout(null);
        setSize(500,500);
        setVisible(true);


    }

    public static void main(String[] args) {
        AwtEmployeeArrayList ae=new AwtEmployeeArrayList();
    }
}

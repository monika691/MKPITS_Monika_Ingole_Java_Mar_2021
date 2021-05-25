/*-example where we are storing Student class object in an array list.(accept the rno,name and age from the user)

 */
package com.mkpits.java.collection;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class AwtStudentArrayList extends JFrame {
    JLabel l1,l2,l3;
    JTextField tf1,tf2,tf3;
    JButton b1,b2;
    JTextArea ta;
    ArrayList<String> student=new ArrayList<String>();
    AwtStudentArrayList(){
        l1=new JLabel("roll no");
        l1.setBounds(10,50,100,30);
        add(l1);
        tf1=new JTextField();
        tf1.setBounds(110,50,100,30);
        add(tf1);

        l2=new JLabel("Name");
        l2.setBounds(10,100,100,30);
        add(l2);
        tf2=new JTextField();
        tf2.setBounds(110,100,100,30);
        add(tf2);

        l3=new JLabel("Age");
        l3.setBounds(10,150,100,30);
        add(l3);
        tf3=new JTextField();
        tf3.setBounds(110,150,100,30);
        add(tf3);

        b1=new JButton("Add Student");
        b1.setBounds(20,200,150,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                student.add(tf1.getText());
                student.add(tf2.getText());
                student.add(tf3.getText());
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");

            }
        });add(b1);

        b2=new JButton("Display Student");
        b2.setBounds(180,200,150,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               StringBuilder sb=new StringBuilder();
               for (String str : student){
                   sb.append("student details :" + str + "\n");
                   ta.setText(sb.toString());
               }
            }
        });add(b2);

        ta=new JTextArea("details");
        ta.setBounds(10,250,200,200);
        add(ta);

        setLayout(null);
        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        AwtStudentArrayList as=new AwtStudentArrayList();
    }
}

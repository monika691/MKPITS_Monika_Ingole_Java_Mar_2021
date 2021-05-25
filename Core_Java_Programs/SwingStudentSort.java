/*program on arraylist sorting  in swing

 */
package com.mkpits.java.collection;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class SwingStudentSort extends JFrame {
    JLabel l1,l2;
    JTextField tf1,tf2;
    JButton b1,b2,b3,b4,b5;
    JTextArea ta;
    ArrayList<String> stud=new ArrayList<String>();
    SwingStudentSort(){

        l1=new JLabel("Enter student name");
        l1.setBounds(10,50,120,30);
        add(l1);
        tf1=new JTextField();
        tf1.setBounds(150,50,150,30);
        add(tf1);

        b1=new JButton("Add Student");
        b1.setBounds(30,100,150,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               stud.add(tf1.getText());
               tf1.setText(" ");
            }
        });add(b1);
        b2=new JButton("Display Student");
        b2.setBounds(190,100,150,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               StringBuilder sb=new StringBuilder();
               for (String str : stud){
                   sb.append("student name : " + str + "\n");
                   ta.setText(sb.toString());
                }
            }
        });add(b2);

        b5=new JButton("sort name");
        b5.setBounds(350,100,120,30);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Collections.sort(stud);
                StringBuilder sb=new StringBuilder();
                for (String str : stud){
                    sb.append("Student name : " + str +"\n");
                }ta.setText(sb.toString());
            }
        });add(b5);

        ta=new JTextArea("Student list");
        ta.setBounds(10,150,250,200);
        add(ta);

        l2=new JLabel("Enter student no to view ");
        l2.setBounds(10,400,150,30);
        add(l2);
        tf2=new JTextField();
        tf2.setBounds(160,400,100,30);
        add(tf2);

        b3=new JButton("Get Method");
        b3.setBounds(30,450,120,30);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String res=stud.get(Integer.parseInt(tf2.getText()));
            ta.setText("Student number at index : " + tf2.getText()+":"+res);
            }
        });add(b3);

        b4=new JButton("Set Method");
        b4.setBounds(160,450,120,30);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             stud.set(Integer.parseInt(tf2.getText()), tf1.getText());
            }
        });add(b4);

        setLayout(null);
        setSize(500,600);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingStudentSort ss=new SwingStudentSort();
    }

}

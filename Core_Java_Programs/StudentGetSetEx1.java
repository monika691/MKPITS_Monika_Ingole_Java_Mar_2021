/*7- program on get  and set method of arraylist using awt

 */
package com.mkpits.java.collection;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudentGetSetEx1 extends Frame {
    Label l1,l2;
    TextField tf1,tf2;
    Button b1,b2,b3,b4;
    TextArea ta;
    ArrayList<String> stud=new ArrayList<String>();
    StudentGetSetEx1(){

        l1=new Label("Enter student name");
        l1.setBounds(10,50,120,30);
        add(l1);
        tf1=new TextField();
        tf1.setBounds(150,50,150,30);
        add(tf1);

        b1=new Button("Add Student");
        b1.setBounds(30,100,100,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               stud.add(tf1.getText());
               tf1.setText("");
            }
        });add(b1);
        b2=new Button("Display Student");
        b2.setBounds(140,100,100,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb=new StringBuilder();
                for (String str : stud) {
                    sb.append("Student name : " + str + "\n");
                    ta.setText(sb.toString());
                }
            }
        });add(b2);

        ta=new TextArea("Student list");
        ta.setBounds(10,150,250,200);
        add(ta);

        l2=new Label("Enter student no to view ");
        l2.setBounds(10,400,150,30);
        add(l2);
        tf2=new TextField();
        tf2.setBounds(160,400,100,30);
        add(tf2);

        b3=new Button("Get Method");
        b3.setBounds(30,450,120,30);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res=stud.get(Integer.parseInt(tf2.getText()));
                ta.setText("Student number at index : " + tf2.getText()+":"+res);
            }
        });add(b3);

        b4=new Button("Set Method");
        b4.setBounds(160,450,120,30);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               stud.set(Integer.parseInt(tf2.getText()),tf1.getText());
            }
        });add(b4);

        setLayout(null);
        setSize(500,600);
        setVisible(true);
    }

    public static void main(String[] args) {
        StudentGetSetEx1 sg=new StudentGetSetEx1();
    }
    }





/* Student arraylist example by usinu Awt

 */
package com.mkpits.java.collection;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudentAwtArrayList extends Frame {
    Label l1;
    TextArea ta;
    TextField tf1;
    Button b1,b2;
    ArrayList<String> stud=new ArrayList<String>();
    StudentAwtArrayList(){


        l1=new Label("Enter Student name");
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
                tf1.setText(" ");
            }
        });add(b1);
        b2=new Button("Display Student");
        b2.setBounds(140,100,100,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { StringBuilder sb=new StringBuilder();
            for (String str : stud){
         sb.append("Student name : " + str + " \n ");
         ta.setText(sb.toString());
}
            }
        });add(b2);
        ta=new TextArea();
        ta.setBounds(10,150,200,200);
        add(ta);

        setLayout(null);
        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        StudentAwtArrayList sa=new StudentAwtArrayList();
    }
}

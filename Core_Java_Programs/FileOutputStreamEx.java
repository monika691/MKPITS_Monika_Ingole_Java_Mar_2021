package com.mkpits.java.io;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamEx extends Frame {
    Label l1,l2,l3;
    Button b,b1;
    TextField tf1,tf2;
    TextArea ta;
    FileOutputStreamEx(){
        l1=new Label("Enter Name");
        l1.setBounds(10,50,80,30);
        add(l1);
        tf1=new TextField();
        tf1.setBounds(90,50,100,30);
        add(tf1);

        l2=new Label("Enter email");
        l2.setBounds(10,100,80,30);
        add(l2);
        tf2=new TextField();
        tf2.setBounds(90,100,150,30);
        add(tf2);

        l3=new Label("Status");
        l3.setBounds(10,200,150,30);
        add(l3);

        b=new Button("Save");
        b.setBounds(20,150,50,30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n="Name : " + tf1.getText();
                String n1="\n Email : " + tf2.getText();
                try{
                    FileOutputStream fout=new FileOutputStream("G:\\Monika\\fn.txt");
                    byte b[]=n.getBytes();
                    fout.write(b);
                    b=n1.getBytes();
                    fout.write(b);
                    fout.close();
                    l3.setText("Success");
                }catch (Exception ee){
                    System.out.println(ee);
                }
            }
        });add(b);


        setLayout(null);
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        FileOutputStreamEx fo=new FileOutputStreamEx();
    }
}

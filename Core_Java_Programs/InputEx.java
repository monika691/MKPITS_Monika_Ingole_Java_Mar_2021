package com.mkpits.java.io;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class InputEx extends Frame {
    Label l1,l2,l3;
    Button b,b1;
    TextField tf1,tf2;
    TextArea ta;

    InputEx(){
        l1 = new Label("Enter Name");
        l1.setBounds(10, 50, 80, 30);
        add(l1);
        tf1 = new TextField();
        tf1.setBounds(90, 50, 100, 30);
        add(tf1);

        l2 = new Label("Enter email");
        l2.setBounds(10, 100, 80, 30);
        add(l2);
        tf2 = new TextField();
        tf2.setBounds(90, 100, 150, 30);
        add(tf2);

        l3 = new Label("Status");
        l3.setBounds(10, 200, 150, 30);
        add(l3);

        ta=new TextArea();
        ta.setBounds(10,250,150,200);
        add(ta);

        b=new Button("save");
        b.setBounds(10,150,50,30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n="name :" +tf1.getText();
                String n1="\n email : " +tf2.getText();
                try{
                    FileOutputStream fout=new FileOutputStream("G:\\Monika\\fn.txt");
                    BufferedOutputStream bo=new BufferedOutputStream(fout);
                    byte b[]=n.getBytes();
                    bo.write(b);
                    b=n1.getBytes();
                    bo.write(b);
                    bo.close();
                    fout.close();
                    l3.setText("success.");
                }catch (Exception ee){
                    System.out.println(ee);
                }
            }
        });
        add(b);


        b1=new Button("read");
        b1.setBounds(70,150,50,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String fn=tf1.getText();
                    FileInputStream fis = new FileInputStream(fn);
                    BufferedInputStream bi = new BufferedInputStream(fis);
                    int i = 0;
                    StringBuilder sb = new StringBuilder();
                    while ((i = bi.read()) != -1) {
                        sb.append((char) i);
                    }
                    bi.close();
                    fis.close();
                    ta.setText(sb.toString());
                }catch (Exception ee){
                    ta.setText(ee.toString());
                }
            }
        });add(b1);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        InputEx in=new InputEx();
    }
}

/*awt example to read data to file

 */
package com.mkpits.java.io;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class FileInputStreamEx2 extends Frame {
    Label l1, l2, l3;
    Button b,b1;
    TextField tf1, tf2;
    TextArea ta;

    FileInputStreamEx2() {
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

        b=new Button("Save");
        b.setBounds(10,150,50,30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n="name : " + tf1.getText();
                String n1=" \n email : " + tf2.getText();
                try{
                    FileOutputStream fou=new FileOutputStream("G:\\Monika\\fn.txt");
                    byte b[]=n.getBytes(StandardCharsets.UTF_8);
                    fou.write(b);
                    b=n1.getBytes(StandardCharsets.UTF_8);
                    fou.write(b);
                    fou.close();
                    l3.setText("Success");
                }catch (Exception ee){
                    System.out.println(ee);
                }
            }
        });
add(b);
        ta = new TextArea();
        ta.setBounds(10, 250, 150, 150);
        add(ta);

        b1 = new Button("read");
        b1.setBounds(70, 150, 80, 30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = tf1.getText();
                String n1 = tf2.getText();
                try {
                    FileInputStream fin = new FileInputStream("G:\\Monika\\fn.txt");
                    int i = 0;
                    StringBuilder sb = new StringBuilder();
                    while ((i = fin.read()) != -1) {
                        sb.append((char) i);

                    }
                    fin.close();
                    ta.setText(sb.toString());
                } catch (Exception ee) {
                    System.out.println(ee);
                }
            }
        });
        add(b1);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        FileInputStreamEx2 fin2=new FileInputStreamEx2();
    }
}

/*Product program on arraylist sorting  in swing

 */
package com.mkpits.java.collection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class ProductSwingSort extends JFrame {
    JLabel l1,l2;
    JTextArea ta;
    JTextField tf1;
    JButton b1, b2,b3,b4,b5;
    ArrayList<String> product = new ArrayList<String>();

    ProductSwingSort() {


        l1 = new JLabel("Enter product name");
        l1.setBounds(10, 50, 120, 30);
        add(l1);
        tf1 = new JTextField();
        tf1.setBounds(150, 50, 150, 30);
        add(tf1);

        b1 = new JButton("Add Product");
        b1.setBounds(30, 100, 120, 30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                product.add(tf1.getText());
                tf1.setText(" ");
            }
        });
        add(b1);
        b2 = new JButton("Display Product");
        b2.setBounds(160, 100, 150, 30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                for (String str : product) {
                    sb.append("Product name : " + str + " \n ");
                    ta.setText(sb.toString());
                }
            }
        });
        add(b2);

        b5=new JButton("Sort Name");
        b5.setBounds(320,100,150,30);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Collections.sort(product);
                StringBuilder sb=new StringBuilder();
                for (String str : product){
                    sb.append("product name : " + str + "\n");
                    ta.setText(sb.toString());
                }
            }
        });add(b5);

        ta = new JTextArea("Details");
        ta.setBounds(20, 150, 220, 200);
        add(ta);

        l2=new JLabel("Enter index no.to view");
        l2.setBounds(10,375,150,30);
        add(l2);
        TextField tf2=new TextField();
        tf2.setBounds(160,375,100,30);
        add(tf2);

        b3=new JButton("Getdata");
        b3.setBounds(20,420,80,30);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String res=product.get(Integer.parseInt(tf2.getText()));
                ta.setText("Product number at index : " + tf2.getText()+":"+res);

            }
        });add(b3);

        b4=new JButton("Setdata");
        b4.setBounds(110,420,80,30);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                product.set(Integer.parseInt(tf2.getText()), tf1.getText());
            }
        });add(b4);


        setLayout(null);
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        ProductSwingSort pss=new ProductSwingSort();
    }

}

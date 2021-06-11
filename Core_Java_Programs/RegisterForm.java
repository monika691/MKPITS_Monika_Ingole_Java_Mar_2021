/*2- create a registration form

 */
package com.mkpit.java.jdbc2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class RegisterForm extends JFrame {
    JRadioButton rb1,rb2;
    ButtonGroup bg;
    JCheckBox cb1,cb2;
    JComboBox city;
    RegisterForm(){
        JLabel l=new JLabel("Registration Form");
        l.setBounds(10,50,150,30);
        add(l);

        JLabel l1=new JLabel("username");
        l1.setBounds(10,100,80,30);
        add(l1);

        JTextField t1=new JTextField();
        t1.setBounds(90,100,80,30);
        add(t1);


        JLabel l2=new JLabel("pass");
        l2.setBounds(10,150,80,30);
        add(l2);

        JPasswordField t2=new JPasswordField();
        t2.setBounds(90,150,80,30);
        add(t2);

        JLabel l3=new JLabel("gender");
        l3.setBounds(10,200,80,30);
        add(l3);

        rb1=new JRadioButton("male");
        rb1.setBounds(90,200,80,30);
        add(rb1);

        rb2=new JRadioButton("female");
        rb2.setBounds(180,200,80,30);
        add(rb2);

        bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        JLabel l4=new JLabel("course");
        l4.setBounds(10,250,80,30);
        add(l4);

        cb1=new JCheckBox("java");
        cb1.setBounds(90,250,80,30);
        add(cb1);

        cb2=new JCheckBox("mysql");
        cb2.setBounds(180,250,80,30);
        add(cb2);

        JLabel l5=new JLabel("city");
        l5.setBounds(10,300,80,30);
        add(l5);

        String[]
ct={"mumbai","pune","nagpur"};

        city=new JComboBox(ct);
        city.setBounds(90,300,80,30);
        add(city);

        JLabel l6=new JLabel("status");
        l6.setBounds(10,400,80,30);
        add(l6);

        JButton b1=new JButton("register");
        b1.setBounds(50,350,80,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String un = t1.getText();
                String p = t2.getText();
                String g = null;
                if (rb1.isSelected())
                    g = "male";
                 else if (rb2.isSelected())
                    g = "female";

                String course = null;
                if (cb1.isSelected())
                    course = "java";
                 else if (cb2.isSelected())
                    course = course+ "mysql";

                String city1 = city.getSelectedItem().toString();
                Connection con = null;
                Statement stmt = null;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpitsshop", "root", "");
                    stmt = con.createStatement();
                    String str = "insert into register(username,pass,gender,course,city)values('" + un + "','" + p + "','" + g + "','" + course + "','" + city1 + "')";
                    stmt.executeUpdate(str);
                    l6.setText("registered sucessfull");
                    t1.setText("");
                    t2.setText("");
                    stmt.close();
                    con.close();

                } catch (Exception ee) {
                    System.out.println(ee.toString());
                }
            }
        });add(b1);
        setLayout(null);
        setTitle("mkpits");
        setSize(500,500);
        setVisible(true);
        setTitle("registration form");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        RegisterForm rf=new RegisterForm();
    }
    }


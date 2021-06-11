/*3 - create a login form and check the credentials from the register table .

 */
package com.mkpit.java.jdbc2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginForm extends JFrame {
    LoginForm(){
        JLabel l=new JLabel("Registration form");
        l.setBounds(10,50,120,30);
        add(l);

        JLabel l1=new JLabel("username");
        l1.setBounds(10,100,80,30);
        add(l1);
        JTextField t1=new JTextField();
        t1.setBounds(90,100,120,30);
        add(t1);

        JLabel l2=new JLabel("password");
        l2.setBounds(10,150,80,30);
        add(l2);
        JPasswordField t2=new JPasswordField();
        t2.setBounds(90,150,120,30);
        add(t2);

        JLabel l3=new JLabel("status");
        l3.setBounds(10,250,180,30);
        add(l3);

        JButton b1=new JButton("login");
        b1.setBounds(50,200,80,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String un=t1.getText();
                String p=t2.toString();
                Connection con=null;
                Statement stmt=null;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpitsshop", "root", "");
                    stmt= con.createStatement();
                    String str="select * from register where username='"+un+"' and pass='"+p+"'";
                    ResultSet rs=stmt.executeQuery(str);
                    int flag=0;
                    while (rs.next()){
                        flag=1;
                    }if(flag==1){
                        l3.setText("Login successfull");
                    }else {
                        l3.setText("invalid credential,try again...!");
                    }t1.setText("");
                    t2.setText("");
                    stmt.close();
                    con.close();
                }catch (Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b1);

        JButton b2=new JButton("reset");
        b2.setBounds(140,200,80,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
t1.setText("");
t2.setText("");
            }
        });add(b2);

        setLayout(null);
        setTitle("mkpits");
        setSize(600,600);
        setVisible(true);
    }
static  LoginForm logi=null;
    public static void main(String[] args) {
        logi=new LoginForm();
    }
}

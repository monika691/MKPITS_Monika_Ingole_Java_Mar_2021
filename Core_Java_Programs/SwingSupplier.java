/*10 create a swing form to insert update delete and search supplier table.

 */
package com.mkpits.java.jdbcmysql;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SwingSupplier extends JFrame{
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5,t6;
    JButton b1,b2,b3,b4;
    Connection con=null;
    Statement stmt=null;
    SwingSupplier() {
        l1 = new JLabel("Sup_id");
        l1.setBounds(10, 50, 80, 30);
        add(l1);
        t1 = new JTextField();
        t1.setBounds(90, 50, 120, 30);
        add(t1);

        l2 = new JLabel("Sup_name");
        l2.setBounds(10, 100, 80, 30);
        add(l2);
        t2 = new JTextField();
        t2.setBounds(90, 100, 120, 30);
        add(t2);

        l3 = new JLabel("Sup_addr");
        l3.setBounds(10, 150, 80, 30);
        add(l3);
        t3 = new JTextField();
        t3.setBounds(90, 150, 120, 30);
        add(t3);

        l4 = new JLabel("Pname");
        l4.setBounds(10, 200, 80, 30);
        add(l4);
        t4 = new JTextField();
        t4.setBounds(90, 200, 120, 30);
        add(t4);

        l5 = new JLabel("Cp");
        l5.setBounds(10, 250, 80, 30);
        add(l5);
        t5 = new JTextField();
        t5.setBounds(90, 250, 120, 30);
        add(t5);

        l6 = new JLabel("Pid");
        l6.setBounds(10, 300, 80, 30);
        add(l6);
        t6 = new JTextField();
        t6.setBounds(90, 300, 120, 30);
        add(t6);

        b1=new JButton("Save");
        b1.setBounds(10,350,80,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpitsshop","root","");
                    System.out.println("connected successfully");
                    stmt= con.createStatement();
                    String str="Insert into supplier value('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"','"+t6.getText()+"')";
                    stmt.executeUpdate(str);
                    l7.setText("record added succesfully");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    t6.setText("");
                    con.close();

                }catch (Exception ee){
                    l7.setText(ee.toString());
                }
            }
        });
        add(b1);

        b2=new JButton("Update");
        b2.setBounds(100,350,80,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpitsshop","root","");
                    stmt= con.createStatement();
                    String str="Update supplier set sup_name='"+t2.getText()+"',Sup_addr='"+t3.getText()+"',pname='"+t4.getText()+"',cp='"+t5.getText()+"',pid='"+t6.getText()+"' where Sup_id='"+t1.getText()+"'";
                    stmt.executeUpdate(str);
                    con.close();
                    l7.setText("record updated succesfully");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    t6.setText("");

                }catch (Exception ee){
                    l7.setText(ee.toString());
                }
            }
        });
        add(b2);

        b3=new JButton("Delete");
        b3.setBounds(190,350,80,30);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpitsshop","root","");
                    stmt= con.createStatement();
                    String str="Delete from supplier where sup_id='"+t1.getText()+"'";
                    stmt.executeUpdate(str);
                    l7.setText("record deleted succesfully");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    t6.setText("");

                }catch (Exception ee){
                    l7.setText(ee.toString());
                }
            }
        });
        add(b3);

        b4=new JButton("Search");
        b4.setBounds(280,350,80,30);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpitsshop", "root", "");
                    stmt = con.createStatement();
                    String str = "Select * from supplier where sup_id='" + t1.getText() + "'";
                    ResultSet rs = stmt.executeQuery(str);
                    int flag = 0;
                    while (rs.next()) {
                        flag = 1;
                        t2.setText(rs.getString("Sup_name"));
                        t3.setText(rs.getString("Sup_addr"));
                        t4.setText(rs.getString("pname"));
                        t5.setText(rs.getString("cp"));
                        t6.setText(rs.getString("pid"));

                    }
                    if (flag == 0) {

                        l7.setText("record not found");
                        t2.setText("");
                        t3.setText("");
                        t4.setText("");
                        t5.setText("");
                        t6.setText("");
                    }rs.close();
                    con.close();


            }catch (Exception ee){
                    l7.setText(ee.toString());
                }
            }
        });
        add(b4);

        l7=new JLabel("Status");
        l7.setBounds(10,400,400,30);
        add(l7);

        setTitle("Supplier Form");
        setLayout(null);
        setSize(600,500);
        setVisible(true);

    }

    public static void main(String[] args) {
        SwingSupplier ss=new SwingSupplier();
    }
    }


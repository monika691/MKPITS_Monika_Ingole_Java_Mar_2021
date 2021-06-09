/*9- create a swing form to insert  ,update and delete and search records  into shop table.

 */
package com.mkpits.java.jdbcmysql;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SwingShop extends JFrame {
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4;
    JButton b1,b2,b3,b4;
    Connection con=null;
    Statement stmt=null;
    SwingShop(){
        l1=new JLabel("Shop id");
        l1.setBounds(10,50,80,30);
        add(l1);
        t1=new JTextField();
        t1.setBounds(90,50,120,30);
        add(t1);

        l2=new JLabel("City");
        l2.setBounds(10,100,80,30);
        add(l2);
        t2=new JTextField();
        t2.setBounds(90,100,120,30);
        add(t2);

        l3=new JLabel("Owner");
        l3.setBounds(10,150,80,30);
        add(l3);
        t3=new JTextField();
        t3.setBounds(90,150,120,30);
        add(t3);

        l4=new JLabel("Address");
        l4.setBounds(10,200,80,30);
        add(l4);
        t4=new JTextField();
        t4.setBounds(90,200,120,30);
        add(t4);

        b1=new JButton("Save");
        b1.setBounds(10,250,80,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
try{Class.forName("com.mysql.jdbc.Driver");
    con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpitsshop","root","");
    System.out.println("connected successfully");
    stmt=con.createStatement();
    String str="insert into shop values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"')";
    stmt.executeUpdate(str);
    l5.setText("record added sucessfully");
    t1.setText("");
    t2.setText("");
    t3.setText("");
    t4.setText("");
    con.close();

}catch (Exception ee){
l5.setText(ee.toString());
}
            }
        });
        add(b1);

        b2=new JButton("Update");
        b2.setBounds(100,250,80,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{Class.forName("com.mysql.jdbc.Driver");
                    con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpitsshop","root","");

                    stmt=con.createStatement();
                    String str="update shop set city='"+t2.getText()+"',owner='"+t3.getText()+"',address='"+t4.getText()+"' where shop_id='"+t1.getText()+"'";
                    stmt.executeUpdate(str);
                    con.close();
                    l5.setText("record updated sucessfully");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");


                }catch (Exception ee){
                    l5.setText(ee.toString());
                }
            }
        });
        add(b2);

        b3=new JButton("Delete");
        b3.setBounds(190,250,80,30);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{Class.forName("com.mysql.jdbc.Driver");
                    con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpitsshop","root","");

                    stmt=con.createStatement();
                    String str="delete from shop where shop_id='"+t1.getText()+"'";
                    stmt.executeUpdate(str);
                    con.close();
                    l5.setText("record deleted sucessfully");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");


                }catch (Exception ee){
                    l5.setText(ee.toString());
                }
            }
        });
        add(b3);

        b4=new JButton("Search");
        b4.setBounds(280,250,80,30);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{Class.forName("com.mysql.jdbc.Driver");
                    con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpitsshop","root","");

                    stmt=con.createStatement();
                    String str="select * from shop where shop_id='"+t1.getText()+"'";
                    ResultSet rs=stmt.executeQuery(str);
                    int flag=0;
                    while (rs.next()){
                        flag=1;
                        t2.setText(rs.getString("city"));
                        t3.setText(rs.getString("owner"));
                        t4.setText(rs.getString("address"));
                    }
                    if (flag==0) {


                        l5.setText("record not found");

                        t2.setText("");
                        t3.setText("");
                        t4.setText("");
                    }rs.close();
                    con.close();

                }catch (Exception ee){
                    l5.setText(ee.toString());
                }
            }
        });
        add(b4);

        l5=new JLabel("Status");
        l5.setBounds(10,300,200,30);
        add(l5);

        setTitle("Shop Form");
        setLayout(null);
        setSize(500,500);
        setVisible(true);

    }

    public static void main(String[] args) {
        SwingShop ss=new SwingShop();
    }
}

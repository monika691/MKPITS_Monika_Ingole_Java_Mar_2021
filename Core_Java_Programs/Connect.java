package com.mkpit.java.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connect {
    public static void main(String[] args) {
        Connection con = null;
        try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpitsshop", "root", "");
System.out.println("connected");
                con.close();

            } catch (Exception ee) {
                System.out.println(ee);
            }
    }
}

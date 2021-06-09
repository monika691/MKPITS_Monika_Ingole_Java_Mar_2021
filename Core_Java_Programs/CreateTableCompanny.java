/*create a program to create table company
 .
 */
package com.mkpits.java.jdbcmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableCompanny {
    public static void main(String[] args) {
        Connection con=null;
        Statement stmt=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits2","root","");
            System.out.println("connected successfully");
            stmt= con.createStatement();
            String str="create table company(id int primary key,name varchar(50),address varchar(50),salary double,doj int)";
            stmt.executeUpdate(str);
            System.out.println("table created successfully");
            con.close();

        }catch (Exception ee){
            System.out.println(ee.toString());
        }
    }
}

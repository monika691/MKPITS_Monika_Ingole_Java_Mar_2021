/*2- create a jdbc program to create table into the database.

 */
package com.mkpits.java.jdbcmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreatTableInMysql {
    public static void main(String[] args) {
        Connection con=null;
        Statement stmt=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
             con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits2","root","");
            System.out.println("connected successfully");
            stmt=con.createStatement();
            String str="create table employee (empid int primary key,empname varchar(50))";
            stmt.executeUpdate(str);
            System.out.println("table added succesfully");
            con.close();

        }catch (Exception ee){
            System.out.println(ee);
        }

    }
}

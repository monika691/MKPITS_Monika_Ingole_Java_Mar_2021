/*4- program to insert records in our employee table created.

 */
package com.mkpits.java.jdbcmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertEmployeeRecord {
    public static void main(String[] args) {
        Connection con=null;
        Statement stmt=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter empid");
        int empid=sc.nextInt();
        System.out.println("enter empname");
        String empname=sc.next();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits2","root","");
            System.out.println("connected successfully");
            stmt=con.createStatement();
            String str="insert into employee (empid,empname)values ("+empid+",'"+empname+"')";
            stmt.executeUpdate(str);
            System.out.println("record added succesfully");
            con.close();

        }catch (Exception ee){
            System.out.println(ee);
        }
    }

}

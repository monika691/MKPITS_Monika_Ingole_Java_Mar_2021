/*6-  create a program to update record

 */
package com.mkpits.java.jdbcmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateCompanyRecord {
    public static void main(String[] args) {
        Connection con=null;
        Statement stmt=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter id");
        int id= sc.nextInt();
        System.out.println("enter name");
        String name= sc.next();
        System.out.println("enter age");
        int age= sc.nextInt();
        System.out.println("enter address");
         String address= sc.next();
        System.out.println("enter salary");
        double salary= sc.nextDouble();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits2","root","");
            System.out.println("connected successfully");
            stmt= con.createStatement();
            String str="update company set name='"+name+"',age='"+age+"',address='"+address+"',salary='"+salary+"' where id='"+id+"'";
            stmt.executeUpdate(str);
            System.out.println("record updated succesfully");
            con.close();
        }catch (Exception ee){
            System.out.println(ee.toString());
        }

    }
}

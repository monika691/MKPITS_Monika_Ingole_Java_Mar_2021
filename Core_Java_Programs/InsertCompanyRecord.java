/*5- create a program to insert records into company table.(accept the value from the user).

 */
package com.mkpits.java.jdbcmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertCompanyRecord {
    public static void main(String[] args) {
        Connection con=null;
        Statement stmt=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter id");
        int id=sc.nextInt();
        System.out.println("enter name");
        String name=sc.next();
        System.out.println("enter address");
        String address=sc.next();
        System.out.println("enter salary");
        double salary=sc.nextDouble();

        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits2","root","");
            System.out.println("connected successfully");
            stmt= con.createStatement();
            String str="insert into company(id,name,address,salary)values("+id+",'"+name+"','"+address+"',"+salary+")";
            stmt.executeUpdate(str);
            System.out.println("record added succesfully");
            con.close();
        }catch (Exception ee){
            System.out.println(ee.toString());
        }

    }
}

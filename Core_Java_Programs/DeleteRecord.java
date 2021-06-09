/*7 create a program to delete record

 */
package com.mkpits.java.jdbcmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRecord {
    public static void main(String[] args) {
        Connection con=null;
        Statement stmt=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits2","root","");
            System.out.println("connected successfully");
            stmt= con.createStatement();
            String str="delete from company where id=2 ";
            stmt.executeUpdate(str);
            System.out.println("record deleted succesfully");
            con.close();
        }catch (Exception ee){
            System.out.println(ee.toString());
        }

    }
}

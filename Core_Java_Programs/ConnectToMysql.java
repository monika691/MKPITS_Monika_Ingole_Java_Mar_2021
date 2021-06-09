/*
1- create  a jdbc program to connect to mysql database.
 */
package com.mkpits.java.jdbcmysql;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectToMysql {
    public static void main(String[] args) {

                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits2","root","");
                    System.out.println("Connected");
                    con.close();


                }catch (Exception ee) {
                    System.out.println(ee);
                }

            }
        }




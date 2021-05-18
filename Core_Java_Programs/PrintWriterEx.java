package com.mkpits.java.iostream;

import java.io.File;
import java.io.PrintWriter;

public class PrintWriterEx {
    public static void main(String[] args) {
        try{
            PrintWriter writer =new PrintWriter(System.out);//console
            writer.write("mkpits provides all technology courses");
            writer.flush();
            writer.close();

            PrintWriter writer1=null;
            writer1=new PrintWriter(new File("G://testout.txt"));
            writer1.write("like java,php,python,dot net");
            writer1.flush();
            writer1.close();

        }catch (Exception ee1){

        }
    }
}

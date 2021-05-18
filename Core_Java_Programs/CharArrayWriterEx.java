package com.mkpits.java.iostream;

import java.io.CharArrayWriter;
import java.io.FileWriter;

public class CharArrayWriterEx {
    public static void main(String[] args) {
        try{
        CharArrayWriter cw=new CharArrayWriter();
        cw.write("welcome to mkpits");
        FileWriter f1=new FileWriter("G:/Monika//a.txt");
        FileWriter f2=new FileWriter("G://Monika//b.txt");
        FileWriter f3=new FileWriter("G://Monika//c.txt");
        FileWriter f4=new FileWriter("G://Monika//d.txt");
        cw.writeTo(f1);
        cw.writeTo(f2);
        cw.writeTo(f3);
        cw.writeTo(f4);

        f1.close();
        f2.close();
        f3.close();
        f4.close();

        System.out.println("success..");
    }catch (Exception e2){
        }
}
}
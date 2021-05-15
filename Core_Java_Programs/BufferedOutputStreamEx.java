package com.mkpits.java.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class BufferedOutputStreamEx {
    public static void main(String[] args)throws Exception {
        FileOutputStream fout=new FileOutputStream("G:\\datasave.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);
        String s="welcome to mkpits";
        byte b[]=s.getBytes(StandardCharsets.UTF_8);
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("Success");

}
}
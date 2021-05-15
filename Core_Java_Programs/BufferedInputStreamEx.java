package com.mkpits.java.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamEx {
    public static void main(String[] args) throws Exception {
        try {
            FileInputStream fin = new FileInputStream("G:\\datasave.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            bin.close();
            fin.close();

        } catch (Exception ee) {
            System.out.println(ee);
        }

    }

}
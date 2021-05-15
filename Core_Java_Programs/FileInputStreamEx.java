/*Java FileInputStream example 2: read all characters

 */
package com.mkpits.java.io;

import java.io.FileInputStream;

public class FileInputStreamEx {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("G:\\datasave.txt");
            int i= fin.read();
            System.out.println((char)i);
            fin.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
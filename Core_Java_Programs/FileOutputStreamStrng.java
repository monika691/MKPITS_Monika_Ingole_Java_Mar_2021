/*Java FileOutputStream example 2: write string

 */
package com.mkpits.java.io;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamStrng {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("G:\\datasave.txt");
            String s = "welcome to mkpits";
            byte b[] = s.getBytes(StandardCharsets.UTF_8);
            fout.write(b);
            fout.close();
            System.out.println("Success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
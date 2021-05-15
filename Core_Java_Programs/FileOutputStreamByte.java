/*Java FileOutputStream Example 1: write byte

 */
package com.mkpits.java.io;
import java.io.FileOutputStream;
public class FileOutputStreamByte {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("G:\\datasave.txt");
            fout.write(65);
            fout.close();
            System.out.println("success..");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
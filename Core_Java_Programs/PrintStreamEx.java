/*Example of java PrintStream class, we are simply printing integer and string value.

 */
package com.mkpits.java.iostream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEx {
    public static void main(String[] args) {
        try {
            FileOutputStream fo = new FileOutputStream("G://Monika//fn.txt");
            PrintStream ps = new PrintStream(fo);
            ps.println("hello");
            ps.println(2000);
            ps.println(222.34f);
            ps.close();
            fo.close();
            System.out.println("Success..");
        } catch (Exception ee) {

        }
    }
}
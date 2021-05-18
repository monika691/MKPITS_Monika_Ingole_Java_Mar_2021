/*simultanious writing and reading data from a file

 */
package com.mkpits.java.iostream;
import java.io.*;
import java.io.FileReader;
import java.io.PrintWriter;

public class SimultaneousWriteReadEx {
    public static void main(String[] args) {
        try {
            //data to write in file using printwriter

            PrintWriter writer1 = null;
            writer1 = new PrintWriter(new File("G://testout.txt"));
            writer1.write("oracle microsoft java vc .");
            writer1.flush();
            writer1.close();

            // to raed data
            FileReader fr=new FileReader("G://testout.txt");
            int i;
            while ((i=fr.read())!=-1)
                System.out.print((char)i);
                fr.close();

        }catch (Exception e1){
            e1.printStackTrace();

        }
    }
}

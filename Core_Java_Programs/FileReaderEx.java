/*Java FileReader Example,reading the data from the text file testout.txt using Java FileReader class.

 */
package com.mkpits.java.iostream;

import java.io.FileReader;

public class FileReaderEx {
    public static void main(String[] args)throws Exception {
        try {
            FileReader fr = new FileReader("G://testout.txt");
            int i ;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
                fr.close();
            }

        }catch (Exception ee2){

        }
        }
}

/*Java FileWriter Example
 writing the data in the file testout.txt using Java FileWriter class.

 */
package com.mkpits.java.iostream;
import java.io.*;
public class FileWriterEx {

    public static void main(String[] args) {
        try{
            FileWriter fw=new FileWriter("G://testout.txt");
            fw.write("welcome to mkpits");
            fw.close();
            System.out.println("success...");

        }catch (Exception e){
            System.out.println(e);
        }
    }
}

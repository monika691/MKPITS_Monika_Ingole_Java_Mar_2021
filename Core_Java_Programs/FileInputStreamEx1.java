/*Java FileInputStream example 2: read all characters

 */
package com.mkpits.java.io;

import java.io.FileInputStream;

public class FileInputStreamEx1 {

    public static void main(String[] args) {
        try{
            FileInputStream fin1=new FileInputStream("G:\\datasave.txt");
            int i=0;
            while((i=fin1.read())!=-1){
                System.out.print((char)i);

            }
        }catch (Exception ee){
            System.out.println(ee);
        }
    }
}

/*Example 10
Let's see an example to handle checked exception.
 */
package com.mkpits.java.trycatchblock;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryCatchBlockEx10 {
    public static void main(String[] args) {
        PrintWriter pw;
        try{
            pw=new PrintWriter("jtf.txt");//may throw exception
            pw.println("Saved");
        }
        // providing checked exception
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        System.out.println("file saved successfully");
    }
}

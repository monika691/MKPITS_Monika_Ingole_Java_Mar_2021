/*Example 8
In this example, we handle the generated exception (Arithmetic Exception) with a different type of exception class (ArrayIndexOutOfBoundsException).
 */
package com.mkpits.java.trycatchblock;

public class TRyCatchBlockEx8 {
    public static void main(String[] args) {
        try{
            int data=50/0;//may throw exception
        }
        //handling an Arithmatic exception using arrayindexoutofboundexception
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("rest of code");
    }
}

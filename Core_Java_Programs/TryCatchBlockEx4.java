/*Example 4
Here, we handle the exception using the parent class exception.
 */
package com.mkpits.java.trycatchblock;

public class TryCatchBlockEx4 {
    public static void main(String[] args) {
        try{
            int data=50/2;//may throw an expression
        }
        //hnadling of exception by exception class
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("rest of code");
    }
}

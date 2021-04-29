/*Example 5
Let's see an example to print a custom message on exception.
 */
package com.mkpits.java.trycatchblock;

public class TryCatchBlockEx5 {
    public static void main(String[] args) {
        try{
            int data=50/0;//may throw exception
        }
        //handling exception
        catch(Exception e){
            //print custome message on exception
            System.out.println("number not divided by zero");
        }
    }
}

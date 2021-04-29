/*Example 7
In this example, along with try block, we also enclose exception code in a catch block.
 */
package com.mkpits.java.trycatchblock;

public class TryCatchBlockEx7 {
    public static void main(String[] args) {
        try{
            int data1=50/0;//may throw exception
        }
        //handling an exception
        catch(Exception e){
            //generating exception in catch block
            int data=50/0;//may throw exception
        }
        System.out.println("rest of code");
    }
}

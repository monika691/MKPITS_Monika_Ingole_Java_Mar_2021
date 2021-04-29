/*Example 6
Let's see an example to resolve the exception in a catch block.
 */
package com.mkpits.java.trycatchblock;

public class TryCatchBlockEx6 {
    public static void main(String[] args) {
        int i=50;
        int j=0;
        int data;
        try{
            data=(i/j);//may throw exception
        }
        //handling exception
        catch (Exception e){
            // resolving exception in catch block
            System.out.println(i/(j+2));
        }
    }
}

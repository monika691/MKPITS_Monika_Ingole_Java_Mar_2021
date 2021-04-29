/*Let's try to understand the problem if we don't use a try-catch block.
Example 1
 */
package com.mkpits.java.trycatchblock;

public class TryCatchBlockEx1 {
    public static void main(String[] args) {
        int data=50/0;
        System.out.println("rest of code");
    }
}

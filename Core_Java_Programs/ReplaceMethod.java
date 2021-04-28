/*3) StringBuffer replace() method

The replace() method replaces the given string from the specified beginIndex and endIndex
 */
package com.mkpits.java.Stringbuffer;

public class ReplaceMethod {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        sb.replace(1,3,"java");
        System.out.println(sb);
    }
}

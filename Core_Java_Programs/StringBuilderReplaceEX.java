/*3) StringBuilder replace() method
The StringBuilder replace() method replaces the given string from the specified beginIndex and endIndex.
 */
package com.mkpits.java.StringBuilder;

public class StringBuilderReplaceEX {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        sb.replace(1,3,"java");
        System.out.println(sb);
    }
}

/*2) StringBuilder insert() method
The StringBuilder insert() method inserts the given string with this string at the given position
 */
package com.mkpits.java.StringBuilder;

public class StringBuilderInsertEx {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        sb.insert(1,"java");
        System.out.println(sb);
    }
}

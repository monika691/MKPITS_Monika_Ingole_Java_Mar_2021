/*1) StringBuilder append() method
The StringBuilder append() method concatenates the given argument with this string
 */
package com.mkpits.java.StringBuilder;

public class StringBuilderAppendEx {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        sb.append("java");//now original string is changed
        System.out.println(sb);
    }
}

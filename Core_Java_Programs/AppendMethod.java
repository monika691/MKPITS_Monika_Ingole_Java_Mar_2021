/*1) StringBuffer append() method

The append() method concatenates the given argument with this string.
 */
package com.mkpits.java.Stringbuffer;

public class AppendMethod {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("hello");
        sb.append(" java");//now original string is changed
        System.out.println(sb);
    }
}

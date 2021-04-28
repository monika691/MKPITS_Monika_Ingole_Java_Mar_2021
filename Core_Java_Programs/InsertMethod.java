/*2) StringBuffer insert() method

The insert() method inserts the given string with this string at the given position.
*/
package com.mkpits.java.Stringbuffer;

public class InsertMethod {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("hello");
        sb.insert(1,"java");//now original string is changed
        System.out.println(sb);
    }
}

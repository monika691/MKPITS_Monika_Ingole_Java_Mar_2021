/*static String equalsIgnoreCase(String another)	compares another string. It doesn't check case.

 */
package com.mkpits.java.string;

public class StringIgnoreCaseEx {
    public static void main(String[] args) {
        String fname="munika";
        String lname="monika";
        boolean s=lname.equalsIgnoreCase(fname);
        System.out.println(s);
    }
}

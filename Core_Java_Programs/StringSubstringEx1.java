/*	String substring(int beginIndex, int endIndex)	returns substring for given begin index and end index.

 */
package com.mkpits.java.string;

public class StringSubstringEx1 {
    public static void main(String[] args) {
        String s=new String("example");//creating java string by new keyword
         String ss=s.substring(2,5);
         System.out.println(ss);
    }
}

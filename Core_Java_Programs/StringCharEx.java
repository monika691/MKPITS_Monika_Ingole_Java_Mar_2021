/*Java String class methods
1	char charAt(int index)	returns char value for the particular index
 */
package com.mkpits.java.string;

public class StringCharEx {
    public static void main(String[] args) {
        String s=new String("example");//creating string java by new keyword
        char c=s.charAt(2);
        System.out.println(c);
    }
}

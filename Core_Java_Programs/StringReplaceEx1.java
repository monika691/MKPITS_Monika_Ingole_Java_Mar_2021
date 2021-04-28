/*String replace(CharSequence old, CharSequence new)	replaces all occurrences of the specified CharSequence.
 */
package com.mkpits.java.string;

public class StringReplaceEx1 {
    public static void main(String[] args) {
        String fname="nilima kaly";
        String fullname=fname.replace('y','e');
        System.out.println(fullname);
    }
}

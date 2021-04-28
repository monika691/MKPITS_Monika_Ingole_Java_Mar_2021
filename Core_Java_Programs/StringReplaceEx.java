/*String replace(char old, char new)	replaces all occurrences of the specified char value.
 */
package com.mkpits.java.string;

public class StringReplaceEx {
    public static void main(String[] args) {
        String fname="nelema";
        String fullname=fname.replace('e','i');
        System.out.println(fullname);
    }
}

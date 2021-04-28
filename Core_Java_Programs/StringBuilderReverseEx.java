/*5) StringBuilder reverse() method
The reverse() method of StringBuilder class reverses the current string.
 */
package com.mkpits.java.StringBuilder;

public class StringBuilderReverseEx {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Hello");
        sb.reverse();
        System.out.println(sb);
    }
}

/*6) StringBuilder capacity() method
 */
package com.mkpits.java.StringBuilder;

public class StringBuilderCapacityEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        System.out.println(sb.capacity());//16
        sb.append("my fav language is java");
        System.out.println(sb.capacity());//(16*2)+2 =34 (oldcapacity*2)+2

    }
}

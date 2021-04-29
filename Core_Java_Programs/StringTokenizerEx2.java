/*example of StringTokenizer class ex2

 */
package com.mkpits.java.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerEx2 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("my.name.is.monika", ".");
        while (st.hasMoreElements()) {
            System.out.println(st.nextToken());
        }
    }
}

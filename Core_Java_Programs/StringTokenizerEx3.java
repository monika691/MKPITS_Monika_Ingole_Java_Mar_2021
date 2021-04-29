/*Example of nextToken(String delim) method of StringTokenizer class
 */
package com.mkpits.java.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerEx3 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("my,name,is,monika");
        //printing next token
        System.out.println("next token " + st.nextToken(","));
    }
}

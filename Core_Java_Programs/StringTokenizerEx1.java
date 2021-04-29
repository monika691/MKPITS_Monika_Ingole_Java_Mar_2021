/*Simple example of StringTokenizer class
Let's see the simple example of StringTokenizer class that tokenizes a string "my name is khan" on the basis of whitespace.
 */

package com.mkpits.java.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
    public static void main(String[] args) {
        StringTokenizer st =new StringTokenizer("my name is monika");
        while(st.hasMoreElements())
        {
            System.out.println(st.nextToken());
        }

    }
}

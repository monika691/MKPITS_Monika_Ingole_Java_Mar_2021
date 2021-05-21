/*Example of nextToken(String delim) method of StringTokenizer class example1

 */
package com.mkpits.java.synchronised;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("My,name,is,monika");
        System.out.println("new token is : "+st.nextToken(","));
    }
}

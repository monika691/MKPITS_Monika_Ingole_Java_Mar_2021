/*Simple example of StringTokenizer class

 */
package com.mkpits.java.synchronised;
import java.util.StringTokenizer;
public class StringTokenizerEx {
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("my.name.is.monika",".");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}

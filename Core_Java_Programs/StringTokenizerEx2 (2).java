/*Example of nextToken(String delim) method of StringTokenizer class example2

 */
package com.mkpits.java.synchronised;

import java.util.StringTokenizer;

public class StringTokenizerEx2 {
    public static void main(String[] args) {
        String str="welcome to java programming";
        String arr[]=new String[4];
        StringTokenizer st=new StringTokenizer(str,"");
        int i=0;
        while (st.hasMoreTokens()){
            arr[i]=st.nextToken();
            i=i+1;
        }for (i=0;i<4;i++){
            System.out.println(arr[i]);
        }
    }
}

/*Example of nextToken(String delim) method of StringTokenizer class example3

 */
package com.mkpits.java.synchronised;

import java.util.StringTokenizer;

public class StringTokenozerEx3 {
    public static void main(String[] args) {
        String str="welcome,to,mkpits";
        String arr[]=new String[4];
        StringTokenizer st=new StringTokenizer(str,",");
        int i=0;
        while (st.hasMoreTokens()){
            arr[i]=st.nextToken();
            i=i+1;
        }for(i=0;i<4;i++){
            System.out.println(arr[i]);
        }
    }
}

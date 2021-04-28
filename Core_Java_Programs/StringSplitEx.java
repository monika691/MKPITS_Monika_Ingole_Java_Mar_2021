/*String[] split(String regex)	returns a split string matching regex.
 */
package com.mkpits.java.string;

public class StringSplitEx {
    public static void main(String[] args) {

        String fname="muyuri,ekta,swati";
        String[] arr=fname.split(",");
        for(String s : arr)
            System.out.println(s);


    }
}

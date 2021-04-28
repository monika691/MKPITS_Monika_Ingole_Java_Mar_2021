/*String[] split(String regex, int limit)	returns a split string matching regex and limit.
 */
package com.mkpits.java.string;

public class StringSplitEx1 {
    public static void main(String[] args) {

        String fname="muyuri,ekta,swati";
        String[] arr=fname.split(",",2);
        for(String s : arr)
            System.out.println(s);

    }
}

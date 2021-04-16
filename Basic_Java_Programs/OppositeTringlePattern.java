/*wap to print the pattern as given below
        1	2	3
        1	2
        1

 */

package com.mkpits.java.clanguage;

public class OppositeTringlePattern {
    public static void main(String[] arg)
    {
        int rowcount,colcount;
        for(rowcount=3;rowcount>=0;rowcount--)
        {
            for(colcount=1;colcount<=rowcount;colcount++)
                System.out.print( "\t"+colcount);
            System.out.println();
        }
    }
}

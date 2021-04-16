/*wap to print the pattern as given below
        1	3	5
        1	3	5
        1	3	5

 */
package com.mkpits.java.clanguage;

public class OddNoDesign {
    public static void main(String[] arg)
    {
        int rowcount,colcount;
        for(rowcount=1;rowcount<=5;rowcount=rowcount+2)
        {
            for(colcount=1;colcount<=5;colcount=colcount+2)

            System.out.print("\t" +colcount);
            System.out.println();
        }
    }
}

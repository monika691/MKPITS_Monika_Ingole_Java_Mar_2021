/*22 Write a program in C to make such a pattern like right angle triangle with a number which will repeat a number in a row.
        The pattern like :

        1
        22
        333
        4444

 */
package com.mkpits.java.clanguage;

public class RowPattern {
    public static void main(String[] arg)
    {
        int rowcount,colcount;
        for(rowcount=1;rowcount<=4;rowcount++)
        {
            for(colcount=1;colcount<=rowcount;colcount++)
            {
                System.out.print("\t " + rowcount);
            }System.out.println();
        }
    }
}

/*21 Write a program in C to display the pattern like right angle triangle with a number.
        The pattern like :

        1
        12
        123
        1234

 */
package com.mkpits.java.clanguage;

public class NumberPattern {
    public static void main(String[] arg)
    {
        int rowcount,colcount;
        for(rowcount=1;rowcount<=4;rowcount++)
        {
            for(colcount=1;colcount<=rowcount;colcount++)
            {
                System.out.print("\t "+ colcount);
            }System.out.println();
        }
    }
}

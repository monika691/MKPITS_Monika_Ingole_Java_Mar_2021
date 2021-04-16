/*23 Write a program in C to make such a pattern like right angle triangle with number increased by 1.
        The pattern like :

        1
        2 3
        4 5 6
        7 8 9 10

 */
package com.mkpits.java.clanguage;
public class IncreasedBy1Pattern {
    public static void main(String[] arg)
    {
        int rowcount,colcount,cnt=1;
        for(rowcount=1;rowcount<=4;rowcount++)
        {
            for(colcount=1;colcount<=rowcount;colcount++)
            {
                System.out.print("\t" +cnt);
                cnt++;
            }System.out.println();
        }
    }
}

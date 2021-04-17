/*create a 2 d array of 4 rows and 5 column

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class TwoDArray {
    public static void main(String[] arg)
    {   Scanner sc=new Scanner(System.in);
        int num[][]=new int[4][5];
        int row,col;
        for(row=0;row<4;row++) {
            for (col = 0; col < 5; col++) {
                System.out.println("Enter number");
                num[row][col]=sc.nextInt();
            }
        }
        for(row=0;row<4;row++)
        {
            for(col=0;col<5;col++)
            {
                System.out.print("\t" +num[row][col]);

            }System.out.println();
        }
    }
}

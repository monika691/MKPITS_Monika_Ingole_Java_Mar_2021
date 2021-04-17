/*create a 2 d array of 3 rows and 3 column to store decimal no.

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class DecimalArray {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        float num[][]=new float[3][3];
        int row,col;
        for(row=0;row<3;row++)
        {
            for(col=0;col<3;col++)
            {
                System.out.println("ENter decimal number");
                num[row][col]=sc.nextFloat();
            }
        }
        for(row=0;row<3;row++) {
            for (col = 0; col < 3; col++) {
                System.out.print(" \t " + num[row][col]);
            }System.out.println();
        }
    }
}

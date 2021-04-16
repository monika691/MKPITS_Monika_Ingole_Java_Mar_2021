/*wap to do multiplication of 2 matrix into 3 matrix of 2d array of 3 rows and 3 column.

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class MultipliMatrixArray {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][]={{9,8,7},{6,5,4},{3,2,1}};
        int arr3[][]=new int[3][3];
        int row,col;
        for(row=0;row<3;row++)
        {
            for(col=0;col<3;col++)
            {
                arr3[row][col]=arr1[row][col]*arr2[row][col];
            }
        }
        for(row=0;row<3;row++) {
            for (col = 0; col < 3; col++) {
                System.out.print("\t" + arr3[row][col]);
            }
            System.out.println();
        }
    }
}

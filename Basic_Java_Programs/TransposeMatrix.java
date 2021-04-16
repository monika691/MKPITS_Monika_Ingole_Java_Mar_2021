/*wap to do transpose of a matrix

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class TransposeMatrix {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int mat1[][]=new int[3][3];
        int mat2[][]=new int[3][3];

        int i,j;
        for(i=0;i<3;i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("Enter number");
                mat1[i][j] = sc.nextInt();
            }
        }
            System.out.println("Enter number of  matrix is :");
            System.out.println();

            for(i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                {
                    System.out.print("\t"+mat1[i][j]);
                }System.out.println();
            }
            for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                mat2[j][i] = mat1[i][j];
            }
        }
            System.out.println("transpose of matrix is:");
            System.out.println();

            for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("\t"+mat2[i][j]);
            }System.out.println();
        }

    }
}

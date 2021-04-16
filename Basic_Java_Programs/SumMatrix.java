/*wap to create array of 3 rows and 3 column and display the sum of all element

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class SumMatrix {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int num[][]=new int[3][3];
        int row,col;
        int sum=0;
        for(row=0;row<3;row++)
        {
            for(col=0;col<3;col++)
            {
                System.out.println("Enter number");
                num[row][col]=sc.nextInt();
            }
        }for(row=0;row<3;row++)
    {
        for(col=0;col<3;col++)
        {
            sum=sum + num[row][col];
        }System.out.print("\t" + sum);
    }System.out.println();
    }
}

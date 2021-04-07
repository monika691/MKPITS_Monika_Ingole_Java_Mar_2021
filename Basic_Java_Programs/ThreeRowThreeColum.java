/*15 wap to create 2 d array of 3 rows and 3 columns to store 9 numbers

 */
package com.mkpits.java.basicprogram;
import java.util.*;
public class ThreeRowThreeColum {
    public static void main(String[] args) {
        int num[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter number");
                num[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t" + num[i][j]);
            }System.out.println();

        }
    }
}


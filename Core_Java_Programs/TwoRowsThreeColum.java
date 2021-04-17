/*14 - create a 2 array of 2 rows and 3 columns in java

 */
package com.mkpits.java.basicprogram;
import java.util.*;
public class TwoRowsThreeColum {
    public static void main(String[] args)
    {
        String name[][]={{"monika","sagar","namita"},{"anuroop","anurag","nilima"}};
        for(int i=0;i<2;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t" + name[i][j]);
            }System.out.println();
        }

    }
}

/*- wap to print no. from 50 to 40 using while loop.

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class FiftyToFourty {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int cnt=50;
        while(cnt>=40)
        {
            System.out.println(+cnt);
            cnt--;
        }

    }
}

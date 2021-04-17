/*- wap to print no. from 10 to 20 using while loop

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class TenToTwentyWhileloop {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int cnt=10;
        while(cnt<=20)
        {
            System.out.println(+cnt);
            cnt=cnt+1;
        }

    }
}

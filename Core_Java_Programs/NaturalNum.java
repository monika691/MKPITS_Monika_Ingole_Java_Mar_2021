/*14. Write a program in C to display the first 10 natural numbers

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class NaturalNum {
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int num,cnt=1;

        for(cnt=1;cnt<=10;cnt++)
        {
            System.out.println(+cnt);
        }
    }
}

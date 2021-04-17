/*11 char array

 */
package com.mkpits.java.basicprograms;
import java.util.*;
public class CharArray {
    public static void main(String[] args)
    {   Scanner sc=new Scanner(System.in);
        char num[]=new char[3];
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter char");
            num[i]=sc.next().charAt(0);
        }for(char n: num)
    {
        System.out.println("char " +n);
    }
    }
}

/*-wap to create array 10 elements accept 10 no. from the user and store it in an array
        then accept a no. from the user to search in an array.(linear search)

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class LinearArray {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int num[]={1,2,3,4,5,6,7,8,9,10};
        int userno;
        int cnt;
        System.out.println("Entered number to be search");
        userno=sc.nextInt();
        for(cnt=0;cnt<10;cnt++)
        {
            if(userno==num[cnt])
            {
                System.out.println("entered number"+ '=' + userno + "found in array at positon "+ '=' + cnt);
            }if(num[cnt]==0)
        {
            System.out.println("number not found in array");
        }
        }
    }
}

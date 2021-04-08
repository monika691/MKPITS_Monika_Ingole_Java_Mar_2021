/*6 : wap to accept a no and print table of that number using for loop.

 */
package com.mkpits.java.basicprograms;
import java.util.*;
public class PrintTable {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num;
        int res=1;
        System.out.println("Enter number");
        num=sc.nextInt();
        for(int i=1;i<=10;i++) {
            res = num * i;
            System.out.println(num+"*"+i+"="+res);
        }

    }
}

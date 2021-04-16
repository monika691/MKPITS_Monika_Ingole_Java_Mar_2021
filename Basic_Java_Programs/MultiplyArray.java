/*10 wap to create  a array of 5 element then multiply the elements of array and then display it

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class MultiplyArray {
    public static void main(String[] arg)
    {
        Scanner sc= new Scanner(System.in);
        int num[]={5,6,7,6,8};

        int cnt,mul=1;
        for(cnt=0;cnt<5;cnt++){

            mul = num[cnt] * mul;
        }
        System.out.println("multiplication of number = " +mul);
    }
}

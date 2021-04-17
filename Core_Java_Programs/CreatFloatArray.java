/*11 -wap to create a float array of 5 elements and accept the elements from the user.

 */
package com.mkpits.java.basicprogram;
import java.util.*;
public class CreatFloatArray {
    public static void main(String[] args)
    {
        float num[]=new float[5];
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<5;i++) {
            System.out.println("Enter number");
            num[i] = sc.nextFloat();
        }
        for(int i=0;i<5;i++) {
            System.out.println("number " + num[i]);
        }


    }
}

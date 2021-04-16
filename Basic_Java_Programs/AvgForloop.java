/*wap to accept salary of 10 employee using for loop and then display the average salary.

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class AvgForloop {
    public static void main(String[] arg)
    {
        Scanner sc= new Scanner(System.in);
        int sal;
        int total=0;
        int cnt;
        float avgsal;
        for(cnt=1; cnt<=10; cnt++)
        {
            System.out.println("Enter 10 employee salary");
            sal= sc.nextInt();
            total = total + sal;

        }
        avgsal= (float)(total/10);
        System.out.println("average salary = " + avgsal);
    }
}

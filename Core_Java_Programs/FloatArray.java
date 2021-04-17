/*wap to create a float array 0f 10 elements to store salary of 10 employees

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class FloatArray {
    public static void main(String[] arg)
    {
        Scanner sc= new Scanner(System.in);
        float salary[] = new float [10];
        int cnt;
        for(cnt=0;cnt<10;cnt++)
        {
            System.out.println("Enter salary of employee");
            salary[cnt] = sc.nextFloat();
        }
        for(cnt=0;cnt<10;cnt++)
        {
            System.out.println("salary of 10 employee = "+salary[cnt]);
        }
    }
}

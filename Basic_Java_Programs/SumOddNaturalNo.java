/*19. Write a program in C to display the n terms of odd natural number and their sum

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class SumOddNaturalNo {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int num, i, sum = 0;
        System.out.println("enter any intiger number\n");
        num= sc.nextInt();
        if(num > 0)
        {
            for(i=1;i<=num;i++)
            {
                if( (i%2)!=0)
                {
                    sum += i;
                }
            }System.out.println("sum of number "+ sum);
        }
        else{
            System.out.println("Enter valid number");
        }
    }
}




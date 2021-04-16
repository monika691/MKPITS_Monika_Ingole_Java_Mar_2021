/*wap to accept 3 subject marks and calculate total , percentage and grade (using if else if)

 */

package com.mkpits.java.clanguage;
import java.util.*;
public class ifleseTotalPerGrade {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int m1,m2,m3,total;
        float per;
        System.out.println("Enter 3 subject marks");
        m1= sc.nextInt();
        m2= sc.nextInt();
        m3= sc.nextInt();
        total =m1+m2+m3;
        per=(total/300.0f)*100.0f;
        System.out.println("total marks =" +total);
        System.out.println("percentage " +per);
        if(per>=75)
        {
            System.out.println("grade : distinction");
        }else if(per>=60 && per<75)
        {
            System.out.println("grade : first class");
        }
        else if(per>=40 && per<60)
        {
            System.out.println("grade : second class");
        }
        else
        {
            System.out.println("fail");
        }
    }
}

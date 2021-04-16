/*wap to accept 5 subject marks using for loop calculate total, per, grade.

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class TotalPerGradeForloop {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int marks,total=0;
        int cnt;
        float per;
        for(cnt=1;cnt<=5;cnt++)
        {
            System.out.println("Enter 5 subject marks");
            marks= sc.nextInt();
            total = total + marks;
        }
        System.out.println("total = " + total);
        per = (float)(total/500.0f)*100.0f;
        System.out.println("percentage = " + per);
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

/*wap to accept 5 subject marks using while loop calculate total, per, and grade.

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class TotalPerGradeWhileloop {
    public static void main(String[] arg)
    {
        Scanner sc =new Scanner(System.in);
        int total=0;
        int subject;
        int cnt=1;
        float per;
        while(cnt<=5){
            System.out.println("Enter 5 subject marks");
            subject = sc.nextInt();
            cnt++;
            total = total + subject;
        }
        System.out.println("total marks " + total);
        per=(total/300.0f)*100.0f;
        System.out.println("percentage " + per);

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

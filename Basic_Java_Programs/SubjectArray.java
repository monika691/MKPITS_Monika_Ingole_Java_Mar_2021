/*11 wap to accept rollno, studentname, marks of 5 subject(in an array)
then display total,per,grade.
 */
package com.mkpits.java.clanguage;
import java.util.*;
public class SubjectArray {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int rolno,marks;
        float per;
        int total=0,cnt;
        String name[]=new String[10];

        for(cnt=0;cnt<1;cnt++)
        {
        System.out.println("enter rollnumber");
        rolno=sc.nextInt();
        System.out.println("Enter student name");
         name[cnt]=sc.next();
        }
        for(cnt=0;cnt<5;cnt++)
        {
            System.out.println("Enter 5 subject marks");
            marks= sc.nextInt();
            total = total + marks;
        }
        System.out.println("total marks = " +total);
        per=(float)(total/500.0f)*100.0f;
        System.out.println("percentage = " +per);
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

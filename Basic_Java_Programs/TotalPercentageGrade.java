/*8 wap to accept 5 subject marks and display total , per , grade


 */

import java.util.*;
public class TotalPercentageGrade {
    public static void main(String[] args)
    {
        int s1,s2,s3,s4,s5,total;
        float per;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter subject 1 marks");
        s1=sc.nextInt();
        System.out.println("Enter subject 2 marks");
        s2=sc.nextInt();
        System.out.println("Enter subject 3 marks");
        s3=sc.nextInt();
        System.out.println("Enter subject 4 marks");
        s4=sc.nextInt();
        System.out.println("Enter subject 5 marks");
        s5=sc.nextInt();

        total=s1+s2+s3+s4+s5;
        System.out.println("total of marks is " +total);

        per=(float)(total/500.0f)*100.0f;
        System.out.println("percentage is " +per);


        if (per>=75) {
            System.out.println("grade : distinction");
        }else if(per>60 && per<75) {
            System.out.println("grade : first class");
        }else if(per>40 && per<60) {
            System.out.println("grade: secound class");
        }else {
            System.out.println("fail");
        }

    }
}

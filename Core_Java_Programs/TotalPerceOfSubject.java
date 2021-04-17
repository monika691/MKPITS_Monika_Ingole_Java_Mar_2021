/*wap to accept 3 subject marks and calculate total and percentage of marks.

 */

package com.mkpits.java.clanguage;
import java.util.*;
public class TotalPerceOfSubject {
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int m1,m2,m3,total;
        float per;
        System.out.println("Enter 3 subject marks");
        m1= sc.nextInt();
        m2= sc.nextInt();
        m3= sc.nextInt();

        total =m1+m2+m3;
        per=(total/300.0f)*100.0f;
        System.out.println("total marks =" + total);
        System.out.println("percentage = " +per);
    }
}

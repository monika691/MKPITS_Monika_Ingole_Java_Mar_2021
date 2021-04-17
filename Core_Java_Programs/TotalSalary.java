/*WAP TO ACCEPT BASIC SALARY FROM THE USER AND CALCULATE HRA(17% OF BASIC)
        , DA(28% OF BASIC) , TA(56% OF BASIC) AND TOTAL SALARY.

 */
 package com.mkpits.java.clanguage;
import java.util.*;
public class TotalSalary {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int bsal;
        float hra,da,ta,tsal;
        System.out.println("Enter basic salary");
        bsal=sc.nextInt();
        hra = bsal*0.17f ;  //17%=0.17
        da= bsal*0.28f;     //28%=0.28
        ta = bsal*0.56f;    //56%=0.56
        tsal=hra+da+ta+bsal;
        System.out.println("Total salary = " +tsal);
    }
}

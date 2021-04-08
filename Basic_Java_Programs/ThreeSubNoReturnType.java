/*13 function with arguments and no return type

 */
package com.mkpits.java.basicprograms;
import java.util.*;
public class ThreeSubNoReturnType {
    static void calculate(int marks1,int marks2,int marks3)
    {
        int total= marks1+marks2+marks3;
        System.out.println("total of marks "+ total);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 subject marks");
        int marks1=sc.nextInt();
        int marks2=sc.nextInt();
        int marks3=sc.nextInt();
     calculate(marks1,marks2,marks3);

    }
}

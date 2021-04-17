/*5 - create a class calculate having member variable num1 and num2
        and methods addition, substraction and mutliplication

 */

package com.mkpits.java.basicprograms;
import java.util.*;
public class ClassCalculate {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        Calculate cal1=new Calculate();
        System.out.println("Enter 2 number");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int result =cal1.addition(n1,n2);
        System.out.println("addition : " +result);

        result=cal1.substraction(n1,n2);
        System.out.println("substraction : " + result);

        result = cal1.multiplication(n1,n2);
        System.out.println("multiplication : " +result);
    }
}
    class Calculate {
        int num1;
        int num2;
        int addition(int n1,int n2)
        {
            num1 =n1;
            num2 =n2;
            int res=num1+num2;
            return res;
        }
        int substraction(int n1,int n2)
        {
            num1=n1;
            num2=n2;
            int res=num1 - num2;
            return res;
        }
        int multiplication(int n1,int n2)
        {
            num1=n1;
            num2=n2;
            int res =num1*num2;
            return res;
        }
    }


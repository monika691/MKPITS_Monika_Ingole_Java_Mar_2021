/*5 - create a class calculate having member variable num1 and num2
        and methods addition, substraction and mutliplication

 */

package com.mkpits.java.basicprograms;
import java.util.*;
public class SwitchCaseCalculate {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        Calculate cal = new Calculate();
        System.out.println("Enter 2 numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("Enter operator add,sub,mul");
        String op = sc.next();
        switch (op) {
            case "add":
                int result = cal.addition(n1, n2);

                System.out.println("addition = " + result);
                break;

            case "sub":
                 result = cal.substraction(n1, n2);
                System.out.println("substraction = " + result);
                break;

            case "mul":
                 result = cal.multiplication(n1,n2);
                System.out.println("multiplication = " + result);
                break;
            default: {
                System.out.println("invalid operator");
                break;
            }
        }
    }
    class calculate1
    {
        int num1;
        int num2;

        int addition(int n1,int n2)
        {
            num1=n1;
            num2=n2;
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
            int res=num1*num2;
            return res;
        }
    }
}

/*8.
Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate
 and print the average.
 */
package com.mkpits.java.assignmentday;
import java.util.*;
class Average{
    float avg;
    void calculate(int num1,int num2, int num3)
    {
        float avg= (float)((num1+num2+num3)/3.0f);
        this.avg=avg;
    }
    void print()
    {
        System.out.println("Average is : " +avg);
    }
}
public class OopsAss8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 3 number");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        Average a=new Average();
        a.calculate(num1,num2,num3);
        a.print();
    }
}

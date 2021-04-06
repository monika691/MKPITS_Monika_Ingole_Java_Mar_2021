/*10 wap to accept empno,basic_salary, empname, designation and then display emp details


 */

import java.util.*;
public class EmployeeDetails {
    public static void main(String[] args)
    {
        int empno,basic_salary;
        String empname,designation;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter employee number");
        empno=sc.nextInt();
        System.out.println("Enter employee name");
        empname=sc.next();
        System.out.println("Enter designation");
        designation=sc.next();
        System.out.println("Enter basic salary");
        basic_salary=sc.nextInt();
        System.out.println("Employee detais are :");

        System.out.println("Employee number is "+empno);
        System.out.println("Employee name is " +empname);
        System.out.println("Employee designation is "+designation);
        System.out.println("Employee basic salary is "+basic_salary);

    }
}

/*8 create a class employee having fields empno,empname, designation, salary and
method getemployeedata and displayemployeedata
 */
package com.mkpits.java.basicprograms;
import java.util.*;
class EmployeeEx {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee();
        System.out.println("Enter employee no,name,designation and salary");
        int no = sc.nextInt();
        String n = sc.next();
        String d = sc.next();
        int s = sc.nextInt();
        e1.getemployeedata(no, n, d, s);
        e1.displayemployeedata();
    }
}
    class Employee {
        int empno;
        String name;
        String designation;
        int salary;

        void getemployeedata(int e, String n, String d, int s) {
            empno = e;
            name = n;
            designation = d;
            salary = s;
        }
            void displayemployeedata ()
            {
                System.out.println(" empno :" + empno);
                System.out.println(" empname : " + name);
                System.out.println(" designation :" + designation);
                System.out.println(" salary :" + salary);
            }
    }


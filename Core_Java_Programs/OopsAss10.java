/*10.
Write a program that would print the information (name, year of joining, salary, address) of three employees by
creating a class named 'Employee'. The output should be as follows:
 Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat
 */
package com.mkpits.java.assignmentday;
class Employee {
    String name;
    int yoj;
    String address;

    void displaydata() {
        System.out.println(name + "\t\t\t\t" + yoj + "\t\t\t" + address);
    }
}
public class OopsAss10 {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.name="robert";
        e.yoj=1994;
        e.address="64C- WallsStreat";

        Employee e1=new Employee();
        e1.name="sam";
        e1.yoj=2000;
        e1.address="68D- WallsStreat";

        Employee e2=new Employee();
        e2.name="john";
        e2.yoj=1999;
        e2.address="26B- WallsStreat";

        System.out.println("name  \t\t\t yoj  \t\t\t  address");
        e.displaydata();
        e1.displaydata();
        e2.displaydata();
    }
}


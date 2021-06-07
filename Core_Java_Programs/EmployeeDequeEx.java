/*create a collection of employee using arraydeque class

 */
package com.mkpits.java.collection;

import java.util.ArrayDeque;
import java.util.Deque;
class Employee{
    int id;
    String name,designation;
    int salary;
    public Employee(int id,String name,String designation,int salary){
        this.id=id;
        this.name=name;
        this.designation=designation;
        this.salary=salary;
    }
}
public class EmployeeDequeEx {
    public static void main(String[] args) {
        Deque<Employee> deque=new ArrayDeque<Employee>();
        Employee e1=new Employee(11,"manoj","manger",30000);
        Employee e2=new Employee(12,"rahul","clerk",20000);
        Employee e3=new Employee(13,"kiran","peoun",10000);

        deque.add(e1);
        deque.add(e2);
        deque.add(e3);

        for (Employee emp : deque){
            System.out.println(emp.id + ":" + emp.name + ":" + emp.designation + ":" + emp.salary);
        }
    }
}

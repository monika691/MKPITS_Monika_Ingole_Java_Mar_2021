/*, Emp class inherits Person class so all the properties of Person will be inherited to Emp by default.
 To initialize all the property,
 we are using parent class constructor from child class.
 */
package com.mkpits.java.superkeyword;

import java.util.Scanner;

class Person5{
    int id;
    String name;
    Person5(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
}
class Emp extends Person5{
    float salary;
    Emp(int id,String name,Float salary)
    {
        super(id,name);
        this.salary=salary;
    }
    void display()
    {
        System.out.println("id is : " +id + " name : " + name + " salary : " + salary);
    }
}
public class SuperKeywordEx7 {
    public static void main(String[] args) {
        Emp e= new Emp(1,"monika",67000f);
        e.display();

    }
}

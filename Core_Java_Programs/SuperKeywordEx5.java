/*3) super is used to invoke parent class constructor.
example person
 */
package com.mkpits.java.superkeyword;
import java.util.*;

class Person2{
    String name;
    String address;
    Person2(String name,String address)
    {
        this.name=name;
        this.address=address;
    }
    void displaydata()
    {
        System.out.println("name is : " + name +  " address : " + address);
    }
}
class Student2 extends Person2{
    int rno;
    int marks;
    Student2(int rno,int marks,String name,String address)
    {
        super(name,address);//calling base class constructor with 2 parameter
        this.rno=rno;
        this.marks=marks;
    }
        void displaydata()
        {
        super.displaydata();
            System.out.println("rno is : " + rno +  " marks " + marks);
    }
}
public class SuperKeywordEx5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student details ");
        String name= sc.next();
        String address= sc.next();
        int rno= sc.nextInt();
        int marks= sc.nextInt();

        Student2 s=new Student2(rno,marks,name,address);
        s.displaydata();
    }
}

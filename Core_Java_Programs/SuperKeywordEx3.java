package com.mkpits.java.superkeyword;
import java.util.*;

class Person{
    String name;
    String  address;
    void getdata(String name,String address)
    {
        this.name=name;
        this.address=address;
    }
    void displaydata()
    {
        System.out.println("name of person " + name + " address " + address);
    }
}
class Student extends Person{
    int rno;
    int marks;
    void getdata(int rno,int marks,String name,String address)
    {
        getdata(name,address);
        this.rno=rno;
        this.marks=marks;
    }
    void displaydata()
    {
        super.displaydata();
        System.out.println("roll no " + rno + " marks " + marks);
    }
}
public class SuperKeywordEx3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter student details");
        String name = sc.next();
        String address =sc.next();
        int rno= sc.nextInt();
        int marks = sc.nextInt();

        Student s=new Student();
        s.getdata(rno,marks,name,address);
        s.displaydata();
    }
}

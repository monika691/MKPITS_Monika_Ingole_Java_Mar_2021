/*example of hierarchical inheritance.
        6 create a base class person and create a student class derieved from person class
and create another class employee derieved from person class

 */
import java.util.*;
 class Person4 {
    String name;
    String address;
    public void getpersondata(String name,String address)
    {
        this.name=name;
        this.address=address;
    }
    public void displaypersondata()
    {
        System.out.println("name = " + name + "address = " + address);
    }
}class student5 extends Person4 {
    int rno;
    int marks;

    public void getstudentdata(String name, String address, int rno, int marks) {
        getpersondata(name, address);
        this.rno = rno;
        this.marks = marks;
    }

    public void displaystudentdata() {
        displaypersondata();
        System.out.println("rno= " + rno + " marks" + marks);
    }
}
class employee extends Person4{
    int empno;
    int salary;
    public void getemployeedata(int empno,int salary,String name,String address)
    {
        getpersondata(name,address);
        this.empno=empno;
        this.salary=salary;
    }
    public void displayemployeedata()
    {    displaypersondata();
        System.out.println("empno = " + empno + "salary = " + salary);
    }
}
class testperson {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Student details");
        String name= sc.next();
        String address= sc.next();
        int rno= sc.nextInt();
        int marks= sc.nextInt();

        student5 s=new student5();

        s.getstudentdata(name,address,rno,marks);
        s.displaystudentdata();

        System.out.println("Enter employee details :");
        System.out.println("Enter empno :");
        int empno= sc.nextInt();

        System.out.println("Enter salary :");
        int salary= sc.nextInt();

        System.out.println("Enter empname :");
        String empname= sc.next();

        System.out.println("Enter address :");
        String empaddress= sc.next();

        employee emp=new employee();
        emp.getemployeedata(empno,salary,empname,empaddress);
        emp.displaypersondata();


    }

}

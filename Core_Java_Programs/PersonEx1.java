/*2-  create  a parent class person having field name and address  and  create a derived class student
inherited from person class having additional fields rno and marks. and methods getstudentddata and displaystudent data.

 */
import java.util.*;
public class PersonEx1 {
    String name;
    String address;
}
    //creat derived class student
    class student1 extends PersonEx1
    {   int rno;
        int marks;
        public void getstudentdata(String name,int rno,String address,int marks)
        {
            this.name=name;
            this.address=address;
            this.rno=rno;
            this.marks=marks;
        }
        public void displaystudentdata()
        {
            System.out.println(name + " : " +address + " : " + rno + " : "+ marks);
        }
}
class per1{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student details : ");
        String name= sc.next();
        String address=sc.next();
        int rno=sc.nextInt();
        int marks= sc.nextInt();
        student1 s=new student1();
        s.getstudentdata(name,rno,address,marks);
        s.displaystudentdata();
    }
}
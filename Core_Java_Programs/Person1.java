import java.util.Scanner;

/*3-  create  a parent class person having field name and address and methods getpersondata and displaypersondata
 and  create a derived class student
inherited from person class having additional fields rno and marks.
and methods getstudentddata and displaystudent data.

 */
public class Person1 {
    String name;
    String address;

    public void getpersondata(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void displaypersondata() {
        System.out.println("name is = " + name + ":" + "address is =" + address);
    }
}
    class student3 extends Person1
    {
        int rno;
        int marks;
        public void getstudentdata(int rno,int marks)
        {
            this.rno=rno;
            this.marks=marks;
        }
        public void displaystudentdata()
        {
            System.out.println("rno is = " + rno + ":" +marks);
        }
    }
class per2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student details : ");

        String name= sc.next();
        String address=sc.next();
        int rno=sc.nextInt();
        int marks = sc.nextInt();
        student3 s= new student3();
        s.getpersondata(name,address);
        s.displaypersondata();
        s.getstudentdata(rno,marks);
        s.displaystudentdata();
    }
}

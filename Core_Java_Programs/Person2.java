/*4- calling getpersondata method from getstudentdata method .

 */
import java.util.*;
 class Person2 {
    String name;
    String address;
    public void getpersondata(String name,String address)
    {
        this.name=name;
        this.address=address;
    }
    public  void displaypersondata()
    {
        System.out.println("name is =" + name + "address = " + address);
    }
}
 class student2 extends Person2
{
    int rno;
    int marks;
    public void getstuddata(String name,String address,int rno,int marks)
    {
        getpersondata(name,address);
        this.rno=rno;
        this .marks=marks;
    }
    public void displaystudentdata()
    {
        displaypersondata();
        System.out.println("rno= " +rno + " marks" + marks);
    }
}
class pers3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student details : ");
        String name= sc.next();
        String address= sc.next();
        int rno= sc.nextInt();
        int marks= sc.nextInt();
        student2 s1=new student2();
        s1.getstuddata(name,address,rno,marks);
        s1.displaystudentdata();
    }
}

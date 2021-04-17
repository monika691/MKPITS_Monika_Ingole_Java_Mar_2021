/*inheritance :
        1 - create  a parent class person having field name and address , create a derived class student
inherited from person class having additional fields rno and marks.

 */
public class Person {
    String name;
    String address;
}
    //creat derived class student
    class Student extends Person
    {
        int rollno;
        int marks;
    }
class per{
    public static void main(String[] args) {
        Student s=new Student();
        s.name="Monika";
        s.address="amravati";
        s.rollno=6;
        s.marks=69;
        System.out.println(s.name+ " : " + s.address + " : " + s.rollno + " : " + s.marks);

    }
}

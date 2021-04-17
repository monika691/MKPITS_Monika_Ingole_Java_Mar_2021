/*2- create a program to used student class in different class

 */
public class Student1 {
    int id;
    String name;
}
class teststudent
{
    public static void main(String[] arg)
    {
        Student1 s1 = new Student1();
        s1.id =111;
        s1.name="nahush";
        System.out.println("student id : " +s1.id);
        System.out.println("Student name : " +s1.name);

    }
}

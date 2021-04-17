public class Student2 {
    int id;
    String name;
}
class teststudent2
{
    public static void main(String[] arg)
    {
        Student s1=new Student();
        Student s2=new Student();
        s1.id=101;
        s1.name="monika";
        s2.id=102;
        s2.name="nahush";
        System.out.println(s1.id + "" + s1.name);
        System.out.println(s2.id + "" + s2.name);
    }
}

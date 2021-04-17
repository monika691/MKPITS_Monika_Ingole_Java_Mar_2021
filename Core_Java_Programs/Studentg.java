/*2 class having constructor and method with the same name of class.. overloading

 */
public class Studentg {
    int id;
    String name; //instance variables
    int age;

    //creating constructor
    public Studentg(int i, String n)
    {
        id=i;
        name=n;
    }
    //creating overloading
    public Studentg(int i, String n, int a)
    {
        id=i;
        name=n;
        age=a;
    }
    void displaydata()
    {
        System.out.println( "id is " +id + "name is : " +name +"age is : " + age);
    }
    public void Student()
    {
        System.out.println("Hello from student world");
    }
}
class teststudent{
    public static void main(String[] arg)
    {
        //creat object
        Studentg s1=new Studentg(111,"amit");
        s1.displaydata();    //automatically call constructor
        Studentg s2=new Studentg(112,"nish",23);
        //calling 3 parameter
        s2.displaydata();
        s2.Student();

    }
}

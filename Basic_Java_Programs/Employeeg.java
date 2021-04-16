    /*    7 - static variable example

     */

public class Employeeg {
    int id;
    String name;
   static String company="MKPITS"; //static variable
    public Employeeg(int i, String n)
    {
        id=i;
        name=n;
    }
    void display()
    {
        System.out.println(id  + name + company);
    }
}
class employee1{
    public static void main(String[] arg)
    {
        Employeeg e1=new Employeeg(11,"mohit");
        Employeeg e2=new Employeeg(12,"bharat");
        e1.display();
        e2.display();
    }
}

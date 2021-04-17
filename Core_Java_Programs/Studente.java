/*2- example of calling another constructor using this keyword

 */
public class Studente {
    //creat default constructor
    public Studente()
    {
        System.out.println("Hello from default constructor");
    }
    //creat parameterised constructor
    public Studente(int r)
    {
        this();
        System.out.println("rollno = " +r);
    }
}
class stud1{
    public static void main(String[] arg)
    {
        Studente s1=new Studente(55);

    }
}
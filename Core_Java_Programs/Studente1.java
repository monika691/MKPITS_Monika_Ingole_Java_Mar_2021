/*ex calling parameterized constrctor from default constructor using this key word

 */
public class Studente1 {
    //creat default constructor
    public Studente1()
    {
        this(55);
        System.out.println("Hello from default constructor");
    }
    //creat parameterised constructor
    public Studente1(int r)
    {
        System.out.println("Roll no = " + r);
    }
}
class stud2{
    public static void main(String[] arg)
    {
        Studente1 s=new Studente1();
    }
}

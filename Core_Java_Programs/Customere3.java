/*4- constructor chaining

 */
public class Customere3 {
    int custno;
    String name;
    int amount;
    public Customere3(int custno)
    {
        this.custno=custno;
    }public Customere3(int custno,String name)
    {
        this(custno);
        this.name=name;
    }
    public Customere3(int custno,String name,int amount)
    {
        this(custno,name);
        this.amount=amount;
    }
    void display()
    {
        System.out.println(custno + " : " + name + " : " + amount);
    }
}
class cust3{
    public static void main(String[] args) {
        Customere3 c=new Customere3(123);
        c.display();
        Customere3 c1=new Customere3(124,"Chandu");
        c1.display();
        Customere3 c2=new Customere3(125,"varun",1000);
        c2.display();
    }
}
/*3 - to invoke current class constructor

 */
public class Customere2 {
    int custno;
    String name;
    int amount;
    public Customere2()
    {
        amount= 1000;
        System.out.println("amount = " +amount);
    }
    public Customere2(int custno,String name)
    {
        this();
        this.custno=custno;
        this.name=name;
    }
        void display()
        {
            System.out.println(custno + " : " + name);
        }
}
class cust2{
    public static void main(String[] args) {
        Customere2 c=new Customere2(32,"Rajesh");
        c.display();

    }
}
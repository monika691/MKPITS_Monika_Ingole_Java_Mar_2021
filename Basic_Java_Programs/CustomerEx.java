/*1- create a class customer having field custno and custname and method getdata and showdata

 */
public class CustomerEx {
    int custno;
    String name;
     void getdata(int custno,String name )
    {
        this.custno=custno;
        this.name=name;
    }
    void showdata()
    {
        System.out.println(custno + " : " + name);
    }
}
class customer1{
    public static void main(String[] args) {
        CustomerEx c=new CustomerEx();
        c.getdata(125,"sharad");
        c.showdata();

    }
}
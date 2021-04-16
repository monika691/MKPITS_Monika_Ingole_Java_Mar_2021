/*2- to refer to current class method

 */
public class Customere1 {
    int custno;
    String name;
     void getdata(int custno,String name)
     {
         this.custno=custno;
         this.name=name;
         this.displaydata();
     }
     void displaydata()
     {
        System.out.println(custno + " : " + name );
     }
}
class cust1{
    public static void main(String[] args) {
        Customere1 c=new Customere1();
        c.getdata(1263,"Sagar");
        //c.displaydata();
    }
}
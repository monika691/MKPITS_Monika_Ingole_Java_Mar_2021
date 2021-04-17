/*5 - intilizing using constructor

 */
public class Student4 {
    int id;
    String name;
    //creating constructor
    public Student4(int i,String n)
    {
        id=i;
        name=n;
    }
    public void displayInformation()
    {
        System.out.println("id :" + id + "name : " +name);
    }
}
class teststudent4 {
  public static void main(String[] arg)
  {
    Student4 s1=new Student4(12,"Raman");//automatically call construct.
    s1.displayInformation();
  }
}

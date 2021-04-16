/*4  program using initilizing using method-

 */
public class Student3 {
    int id;
    String name;
    public void insertRecord(int i,String n)
    {
        id=i;
        name=n;
}public void displayInformation()
    {
        System.out.println("id : " +id + "name :" +name);

    }
}
class teststudent3{
    public static void main(String[] arg)
    {
        Student3 s1=new Student3();
        Student3 s2=new Student3();
        s1.insertRecord(111,"monika");
        s2.insertRecord(112,"bhakti");
        s1.displayInformation();
        s2.displayInformation();

    }
}

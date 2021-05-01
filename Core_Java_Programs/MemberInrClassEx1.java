/*Java Member inner class example2

 */
package com.mlpits.java.memberinnerclass;
class Student{
    private int rollno=12;
    class Address{
        public void showdata(){
            System.out.println("roll no " + rollno);
        }
    }
}
public class MemberInrClassEx1 {
    public static void main(String[] args) {
        Student s=new Student();
        Student.Address ad=s.new Address();
        ad.showdata();
    }
}

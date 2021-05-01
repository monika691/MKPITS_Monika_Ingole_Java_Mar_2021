/*Java Member inner class example2

 */
package com.mlpits.java.memberinnerclass;
class employee{
    private int salary=3000;
    class parttimeemployee{
        void display(){
            System.out.println("salary " + salary);
        }
    }
}
public class MemberInrClassEx2 {
    public static void main(String[] args) {
        employee e=new employee();
        employee.parttimeemployee ep=e.new parttimeemployee();
        ep.display();
    }
}

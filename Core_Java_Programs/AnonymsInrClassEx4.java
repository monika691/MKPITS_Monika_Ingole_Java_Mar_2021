/*Java anonymous inner class example4 using interface
 */

package com.mlpits.java.anonymsinnerclass;
interface employe{
    void display();

}
public class AnonymsInrClassEx4 {
    public static void main(String[] args) {
        employe e=new employe() {
            public void display() {
                System.out.println("employee display");
            }
        };
        e.display();
    }
}

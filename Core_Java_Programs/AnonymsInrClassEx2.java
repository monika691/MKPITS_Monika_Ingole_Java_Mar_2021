/* abstract Java anonymous inner class example using class ex2
 */
package com.mlpits.java.anonymsinnerclass;
abstract class employee{
    abstract void display();
}
public class AnonymsInrClassEx2 {
    public static void main(String[] args) {
        employee e=new employee() {
            void display() {System.out.println("employee display");//anonyms inner class

            }
        };
        e.display();
    }
}

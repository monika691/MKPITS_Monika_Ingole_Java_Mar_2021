/*abstract Java anonymous inner class example using class ex1
 */
package com.mlpits.java.anonymsinnerclass;
abstract class person{

    abstract void eat();
}
public class AnonymsInrClassEx1 {
    public static void main(String[] args) {
        person p=new person() {
            void eat() {
                System.out.println("nice fruits");
            }

        } ;
        p.eat();
    }
}

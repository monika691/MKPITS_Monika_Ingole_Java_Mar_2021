/*4-  downcasting with instance of operator
 */
package com.mkpits.java.instofopr;
class Person1{}
class Customer1 extends Person1{
    static void downmethod(Person1 p)
    {
        if (p instanceof Customer1)
        {
            Customer1 cc= (Customer1) p;
          System.out.println("downcasting performed");
        }
       else
           {
           System.out.println("downcasting is not performed");
           }
    }
}
public class DowncastingEx4 {
    public static void main(String[] args) {
        Person1 p= new Customer1();
        Customer1.downmethod(p);
    }
}

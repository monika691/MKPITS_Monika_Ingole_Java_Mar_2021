/*instanceof in java with a variable that have null value

 */
package com.mkpits.java.instofopr;
class Person{}
class Customer extends Person{
    String name;
}
public class InstanceOfEx4 {
    public static void main(String[] args) {
        Customer c=null;
        boolean b = c instanceof Person;
        System.out.println(b);
        if(b==true){
            System.out.println("code to be processed");
        }
    }
}

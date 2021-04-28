/*Another Example of Encapsulation in Java

Let's see another example of encapsulation that has only four fields with its setter and getter methods.
EncapsulationEx4 is 2nd part of Account
 */
package com.mkpits.java.encpsultion;

public class EncapsulationEx4 {
    public static void main(String[] args) {
        //creating instance of Account class
        Account ac=new Account();
        //setting value through setter method
        ac.setacno(543652);
        ac.setName("akshay");
        ac.setEmail("akshay23@gami;.com");
        ac.setAmt(40000f);
        //getting value through getter method
        System.out.println(ac.getacno() + " " +(ac.getName()) + " " + (ac.getEmail())+ " " +(ac.getAmt()));
    }
}

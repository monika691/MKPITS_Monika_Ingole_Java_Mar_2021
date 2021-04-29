/*If the superclass method does not declare an exception,
subclass overridden method cannot declare the checked exception but can declare unchecked exception.
 */
package com.mkpits.java.exceptionnmethodoveridingEx1;
class Parent1{
    void msg(){
        System.out.println("parent");
    }
}
public class ExcpmthdOvridngEx2 extends Parent1 {
    void msg()throws ArithmeticException{
        System.out.println("child");
    }

    public static void main(String[] args) {
        Parent1 p= new ExcpmthdOvridngEx2();
        p.msg();
    }
}

/*Example in case subclass overridden method declares subclass exception

 */
package com.mkpits.java.exceptionnmethodoveridingEx1;
class Parent4{
    void msg()throws Exception{System.out.println("parent");}
}
public class ExcpMthdOvridngEx5 extends Parent4 {
    void msg() throws ArithmeticException {
        System.out.println("child");
    }

    public static void main(String[] args) {
        Parent4 p = new ExcpMthdOvridngEx5();
        try {
            p.msg();
        } catch (Exception e) {
        }
    }
}
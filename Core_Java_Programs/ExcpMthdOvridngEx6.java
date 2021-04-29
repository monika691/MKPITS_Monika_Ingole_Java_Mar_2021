/*Example in case subclass overridden method declares no exception

 */
package com.mkpits.java.exceptionnmethodoveridingEx1;
class Parent5{
    void msg()throws Exception{System.out.println("parent");}
}
public class ExcpMthdOvridngEx6 extends Parent5 {
    void msg() {
        System.out.println("child");
    }

    public static void main(String[] args) {
        Parent5 p = new ExcpMthdOvridngEx6();
        try {
            p.msg();
        } catch (Exception e) {
        }
    }
}
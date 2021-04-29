/*Example in case subclass overridden method declares same exception

 */
package com.mkpits.java.exceptionnmethodoveridingEx1;
class Parent3{
    void msg()throws Exception{System.out.println("parent");}
}
public class ExcpMthdOvridngEx4 extends Parent3 {
    void msg() throws Exception {
        System.out.println("child");
    }

    public static void main(String[] args) {
        Parent3 p = new ExcpMthdOvridngEx4();
        try {
            p.msg();
        } catch (Exception e) {
        }
    }
}
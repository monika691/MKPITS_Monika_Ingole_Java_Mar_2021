/*Example in case subclass overridden method declares parent exception

 */
package com.mkpits.java.exceptionnmethodoveridingEx1;
class Parent2{
    void msg()throws ArithmeticException{System.out.println("parent");}
}
public class ExcpmthdOvridngEx3 extends Parent2 {
    void msg()//throws Exception  ///compile time error
    {System.out.println("child");}

    public static void main(String[] args) {
        Parent2 p=new ExcpmthdOvridngEx3();
        try{
            p.msg();
        }catch (Exception e){}
    }
}

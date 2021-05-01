/*Example of nested interface which is declared within the interface

 */
package com.mlpits.java.nestedinterface;
interface showable{
    void show();
    interface message{
        void msg();
    }
}
public class NestedInterfaceEx1 implements showable.message {
    public void msg(){System.out.println("hello nested interface");}

    public static void main(String[] args) {
        showable.message sm=new NestedInterfaceEx1();//upcasting
        sm.msg();
    }
}

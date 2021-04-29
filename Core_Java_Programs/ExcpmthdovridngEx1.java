/*If the superclass method does not declare an exception,
 subclass overridden method cannot declare the checked exception.
 */
package com.mkpits.java.exceptionnmethodoveridingEx1;

import java.io.IOException;

class Parent{
    void msg(){System.out.println("parent");}
}
public class ExcpmthdovridngEx1 extends Parent {
    void msg() //throws IOException---compile time error
    {System.out.println("child class");
    }

    public static void main(String[] args) {
        Parent p=new ExcpmthdovridngEx1();
        p.msg();
    }
}

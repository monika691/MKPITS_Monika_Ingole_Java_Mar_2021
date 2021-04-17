/*12 - create a non static sayhello method

 */
package com.mkpits.java.basicprograms;
import java.util.*;
public class StudentNonStaticSayHello{
    public static void main(String[] arg)
    {
        StudentNonStaticSayHello s1= new StudentNonStaticSayHello();
        s1.sayHello();

        StudentNonStaticSayHello s2= new StudentNonStaticSayHello();
        s2.sayHello();

        sayHi();
    }
    void sayHello()
    {
        System.out.println("Hello Everybody");
        System.out.println("How are you");
        System.out.println("what are you doing");
    }
    static void sayHi()

    {
        System.out.println("hello from student");
    }
}


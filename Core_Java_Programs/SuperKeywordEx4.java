/*3) super is used to invoke parent class constructor.

 */
package com.mkpits.java.superkeyword;

class Animal3{
    Animal3(){
        System.out.println("Animal is created");
    }
}
class Dog3 extends Animal3
        {
            Dog3()
            { super();
                System.out.println("Dog is created");
            }
        }
public class SuperKeywordEx4 {
    public static void main(String[] args) {
        Dog3 d= new Dog3();

    }
}

/*Example of local inner class with local variable

 */
package com.mlpits.java.localinnerclass;

public class LocalInnerclassEx2 {
    private int data=30;//instance variable
    void display(){
        int value=20;// local variable
        class local{
            void msg(){
                System.out.println(data);
            }
        }
        local l=new local();
        l.msg();
    }

    public static void main(String[] args) {
        LocalInnerclassEx2 li=new LocalInnerclassEx2();
        li.display();
    }
}

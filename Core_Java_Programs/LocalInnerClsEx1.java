/*Java local inner class example
 */

package com.mlpits.java.localinnerclass;

public class LocalInnerClsEx1 {
    private int data = 20;

    void display() {
        class local {
            void msg() {
                System.out.println("data" + data);
            }
        }
        local l = new local();
        l.msg();
    }

    public static void main(String[] args) {
LocalInnerClsEx1 li=new LocalInnerClsEx1();
li.display();
    }
}
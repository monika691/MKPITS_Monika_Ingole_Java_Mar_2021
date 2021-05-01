/*Java static nested class example with static method
 */
package com.mlpits.java.staticnested;

public class Testouter1 {
    static int data = 20;

    static class inner {
       static void msg() {
            System.out.println("hello msg");
        }
    }

    public static void main(String[] args) {
        Testouter1.inner.msg();//no need to creat instance of static nested class
    }
}
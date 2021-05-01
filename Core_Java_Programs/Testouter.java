/*Java static nested class example with instance method

 */
package com.mlpits.java.staticnested;

public class Testouter {
    static int data = 30;

    static class inner {
        void msg() {
            System.out.println("data " + data);
        }
    }
    public static void main(String[] args) {
        Testouter.inner obj = new Testouter.inner();
        obj.msg();
    }
}
/*Java Thread Example by extending Thread class

 */
package com.mkpits.java.thread;

public class ThreadExtendsEx extends Thread{

    public static void main(String[] args) {
        ThreadExtendsEx th=new ThreadExtendsEx();
        th.start();

    }public void run(){
        System.out.println("thread is running...");
    }
}

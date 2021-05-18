/*2) Java Thread Example by implementing Runnable interface

 */
package com.mkpits.java.thread;

public class ThreadImplementEx implements Runnable{
    public static void main(String[] args) {

        ThreadImplementEx th1=new ThreadImplementEx();
        Thread t=new Thread(th1);
        t.start();

    }public void run(){
        System.out.println("thread is running...");
    }
}

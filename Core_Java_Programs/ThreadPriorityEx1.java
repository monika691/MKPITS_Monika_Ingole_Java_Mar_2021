/*Example of priority of a Thread:Example 1

 */
package com.mkpits.java.thread;

public class ThreadPriorityEx1 extends Thread {
    public static void main(String[] args) {
        ThreadPriorityEx1 tp=new ThreadPriorityEx1();
        ThreadPriorityEx1 tp1=new ThreadPriorityEx1();
        ThreadPriorityEx1 tp2=new ThreadPriorityEx1();
        tp.setPriority(MIN_PRIORITY);
        tp2.setPriority(MAX_PRIORITY);
        tp.start();
        tp1.start();
        tp2.start();

    }public  void run(){
        System.out.println("running thread name : " +Thread.currentThread().getName() );
        System.out.println("running thread priority : " +Thread.currentThread().getPriority());
    }
}

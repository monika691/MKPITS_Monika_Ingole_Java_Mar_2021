/*Example of priority of a Thread:

 */
package com.mkpits.java.thread;

public class MultiPriorityEx extends Thread{
    public static void main(String[] args) {
MultiPriorityEx mp=new MultiPriorityEx();
MultiPriorityEx mp1=new MultiPriorityEx();
mp.setPriority(MIN_PRIORITY);
mp1.setPriority(MAX_PRIORITY);
mp.start();
mp1.start();

    }public void run(){
        System.out.println("running thread name is : " + Thread.currentThread().getName());
        System.out.println("running thread priority is : " + Thread.currentThread().getPriority());
    }
}

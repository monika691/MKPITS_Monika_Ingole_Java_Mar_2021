/*Program of performing single task by multiple threads

 */
package com.mkpits.java.thread;

public class MultiTaskingEx1 implements Runnable{
    public static void main(String[] args) {
        Thread t1=new Thread(new MultiTaskingEx1());
        Thread t2=new Thread(new MultiTaskingEx1());
        t1.start();
        t2.start();
    }public void run(){
        System.out.println("task one");
    }
}

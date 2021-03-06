/*Program of performing two tasks by two threads ex4

 */
package com.mkpits.java.thread;

public class MultiTaskingEx4 {
    public static void main(String[] args) {
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                System.out.println("task one");
            }
        };Runnable r2=new Runnable() {
            @Override
            public void run() {
                System.out.println("task two");
            }
        };
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);

        t1.start();
        t2.start();
    }
}

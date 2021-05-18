/*Java Thread Example by implementing Runnable interface Ex1

 */
package com.mkpits.java.thread;

public class ThreadImplementEx1  implements Runnable{
    public static void main(String[] args) {
        ThreadImplementEx1 th=new ThreadImplementEx1();
        Thread t=new Thread(th);
        t.start();
        Thread t1=new Thread(th);
        t1.start();

    }public void run(){
        for(int i=1;i<=5;i++)
        System.out.println(i);
    }
}

/*a thread twice it by the example given below

 */
package com.mkpits.java.thread;

public class ThreadTwiceEx extends Thread{
    public static void main(String[] args) {
        ThreadTwiceEx tw=new ThreadTwiceEx();
        tw.start();
        tw.start();

    }public void run(){

        System.out.println("running..");
    }
}

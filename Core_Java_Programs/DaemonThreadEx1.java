/*Simple example of Daemon thread in java exampl1..it will throw IllegalThreadStateException.

 */
package com.mkpits.java.thread;

public class DaemonThreadEx1 extends Thread{
    public static void main(String[] args) {
        DaemonThreadEx1 dm=new DaemonThreadEx1();
        DaemonThreadEx1 dm1=new DaemonThreadEx1();
        dm.start();
        dm.setDaemon(true);
        dm1.start();

    }public void run(){
        System.out.println("Name "+Thread.currentThread().getName());
        System.out.println("daemon : "+ Thread.currentThread().isDaemon());
    }

}

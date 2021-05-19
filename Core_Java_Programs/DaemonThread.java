/*Simple example of Daemon thread in java

 */
package com.mkpits.java.thread;

public class DaemonThread extends Thread{

    public static void main(String[] args) {
        DaemonThread dm=new DaemonThread();
        DaemonThread dm1=new DaemonThread();
        DaemonThread dm2=new DaemonThread();
        dm.setDaemon(true);
        dm.start();
        dm1.start();
        dm2.start();

    }public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("daemon thread work");
        }else{
            System.out.println("user thread work");
        }
    }
}

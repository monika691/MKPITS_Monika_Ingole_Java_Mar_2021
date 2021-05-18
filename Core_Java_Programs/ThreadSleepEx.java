package com.mkpits.java.thread;

public class ThreadSleepEx extends Thread{
    public static void main(String[] args) {
        ThreadSleepEx ts1=new ThreadSleepEx();
        ThreadSleepEx ts2=new ThreadSleepEx();

        ts1.start();

        ts2.start();

    }public void run(){
        for (int i=1;i<=5;i++)
        {
            try {
                Thread.sleep(500);


            }catch (InterruptedException ie){
                System.out.println(ie);
            }
            System.out.println(i);
        }

    }
}

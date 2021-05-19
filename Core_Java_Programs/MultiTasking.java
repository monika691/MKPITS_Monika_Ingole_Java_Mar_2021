package com.mkpits.java.thread;

public class MultiTasking extends Thread{
    public static void main(String[] args) {
        MultiTasking mt1=new MultiTasking();
        MultiTasking mt2=new MultiTasking();
        MultiTasking mt3=new MultiTasking();

        mt1.start();
        mt2.start();
        mt3.start();
    }public void run(){
        System.out.println("task one");
    }
}

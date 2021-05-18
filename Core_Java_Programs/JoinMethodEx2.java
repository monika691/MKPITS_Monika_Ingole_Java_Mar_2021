package com.mkpits.java.thread;

public class JoinMethodEx2 extends Thread{
    public static void main(String[] args) {
        JoinMethodEx2 jm=new JoinMethodEx2();
        JoinMethodEx2 jm1=new JoinMethodEx2();
        jm.start();
        jm1.start();
    }public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

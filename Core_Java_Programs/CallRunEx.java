package com.mkpits.java.thread;

public class CallRunEx extends Thread{

    public static void main(String[] args) {
        CallRunEx cr1=new CallRunEx();
        cr1.run();
    }public void run(){


            System.out.println("running");
        }

    }


package com.mkpits.java.thread;

public class MultiTaskingEx5 {
    public static void main(String[] args) {
        Thread t1=new Thread(){
            public void run(){
                for (int i=1;i<=30;i++){
                    System.out.println("task one : i = " + i);
                }
            }
        };Thread t2=new Thread(){
            public void run(){
                for (int i=100;i>=70;i--){
                    System.out.println("task two : i = " + i);
                }
            }
        };t1.start();
        t2.start();
    }
}

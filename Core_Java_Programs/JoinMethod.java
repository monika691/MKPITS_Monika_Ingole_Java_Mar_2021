package com.mkpits.java.thread;

public class JoinMethod extends Thread{
    public static void main(String[] args) {
        JoinMethod jm=new JoinMethod();
        JoinMethod jm1=new JoinMethod();
        JoinMethod jm2=new JoinMethod();

        jm.start();
        try{
            jm.join();
        }catch (Exception e){
            System.out.println(e);
        }jm1.start();
        jm2.start();
    }public void run(){
        for (int i=1;i<=5;i++){
            try{
                Thread.sleep(500);

            }catch (InterruptedException ie){
                System.out.println(ie);
            }System.out.println(i);
        }
    }
}

package com.mkpits.java.synchronised;
class customer{
    int amt=10000;
    synchronized void withdrawl(int amt){
        System.out.println("going to withdrawl");
        if(this.amt<amt){
            System.out.println("less balance,waiting for withdrawl ");
            try {
                wait();
            }catch (Exception e){

            }
        }this.amt-=amt;
        System.out.println(" withdrwal completed...");

    }synchronized void deposite(int amt){
        System.out.println("going to deposit");
        this.amt+=amt;
        System.out.println(" deposite completed..");
        notify();
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        final customer c=new customer();
        new Thread(){
            public void run(){
                c.withdrawl(5000);
            }
        }.start();
        new Thread(){
            public void run(){
                c.deposite(10000);
            }
        }.start();
    }
}

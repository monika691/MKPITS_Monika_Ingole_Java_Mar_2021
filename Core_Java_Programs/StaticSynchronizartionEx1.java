package com.mkpits.java.synchronised;
class calculate1{
    synchronized static void addition(int n1,int n2){
        for (int i=1;i<=3;i++){
            int res=n1+n2;
            System.out.println(Thread.currentThread().getName()+ " add " + res);
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }
}
public class StaticSynchronizartionEx1 {
    public static void main(String[] args) {
        Thread t1=new Thread(){
            public void run(){
                calculate1.addition(4,6);
            }
        };Thread t2=new Thread(){
            public void run(){
                calculate1.addition(12,5);
            }
        };Thread t3=new Thread(){
            public void run(){
                calculate1.addition(10,5);
            }
        };t1.start();
        t2.start();
        t3.start();
    }
}

package com.mkpits.java.synchronised;
class Table2{
    synchronized static void printtable(int n){
        for (int i=1;i<=3;i++){
            System.out.println(n*i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }
}
class MyThread3 extends Thread{
    public void run(){
        Table2.printtable(5);
    }
}
class MyThread4 extends Thread{
    public void run(){
        Table2.printtable(10);
    }
}
class MyThread5 extends Thread{
    public void run(){
        Table2.printtable(15);
    }
}
public class StaticSynchronization {
    public static void main(String[] args) {
        MyThread3 t1=new MyThread3();
        MyThread4 t2=new MyThread4();
        MyThread5 t3=new MyThread5();

        t1.start();
        t2.start();
        t3.start();
    }
}

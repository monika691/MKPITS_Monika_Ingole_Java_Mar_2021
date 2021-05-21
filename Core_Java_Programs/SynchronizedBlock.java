/* Example of synchronized block

 */
package com.mkpits.java.synchronised;
class Table{
    public void printtable(int n){
        synchronized (this){
            for (int i=1;i<=5;i++){
                System.out.println(n*i);
                try {
                    Thread.sleep(1000);
                }catch (Exception e){

                }
            }
        }
    }
}
class MyThread1 extends Thread{
    Table t;
    public MyThread1(Table t){
        this.t=t;
    }public void run(){
        t.printtable(5);
    }
}
class MyThread2 extends Thread{
    Table t;
    public MyThread2(Table t){
        this.t=t;
    }public void run(){
        t.printtable(10);
    }
}
public class SynchronizedBlock {
    public static void main(String[] args) {
        Table t1=new Table();
        MyThread1 t2=new MyThread1(t1);
        MyThread2 t3=new MyThread2(t1);
        t2.start();
        t3.start();
    }
}

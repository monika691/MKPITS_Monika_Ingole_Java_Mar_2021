/*//example of java synchronized method

 */
package com.mkpits.java.garbagecollector;

class Table1{
    Table t;
     synchronized void Table1(int n){
        for (int i=1;i<=5;i++){
            System.out.println(n*i);
        }try {
            Thread.sleep(400);
        }catch (Exception e1){

        }
    }

}class MyTable11 extends Thread{
    Table t;
    MyTable11(Table t){
        this.t=t;
    }public void run(){
        t.printTabble(10);
    }

}class MyTable12 extends Thread{
    Table t;
    MyTable12(Table t){
        this.t=t;
    }public void run(){
        t.printTabble(20);
    }
}
public class SynchronisationEx2 {
    public static void main(String[] args) {
        Table ta=new Table();
        MyTable11 t3=new MyTable11(ta);
        MyTable12 t4=new MyTable12(ta);

        t3.start();
        t4.start();


    }
}

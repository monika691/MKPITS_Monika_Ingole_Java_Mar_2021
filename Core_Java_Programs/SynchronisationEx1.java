/*Simple Example of garbage collection in java

 */
package com.mkpits.java.garbagecollector;

class Table{
    Table t;
    void printTabble(int n){
        for (int i=1;i<5;i++){
            System.out.println(n * i);
        }try{
            Thread.sleep(400);

        }catch (Exception e){

        }
    }
}class MyTable1 extends Thread{
    Table t;
    MyTable1(Table t){
        this.t=t;
    }public void run(){
        t.printTabble(5);
    }
}class MyTable2 extends Thread{
    Table t;
    MyTable2(Table t){
        this.t=t;
    }public void run(){
        t.printTabble(100);
    }
}
public class SynchronisationEx1 {
    public static void main(String[] args) {
        Table t=new Table();
        MyTable1 t1=new MyTable1(t);
        MyTable2 t2=new MyTable2(t);

        t1.start();
        t2.start();
    }

}

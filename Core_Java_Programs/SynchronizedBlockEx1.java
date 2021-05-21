/*//Program of synchronized block by using annonymous class

 */
package com.mkpits.java.synchronised;
class Table1{
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
public class SynchronizedBlockEx1 {
    public static void main(String[] args) {
        Table obj=new Table();
        Thread t3=new Thread(){
            public void run(){
              obj.printtable(5);
            }
        };Thread t4=new Thread(){
            public void run(){
                obj.printtable(10);
            }
        };t3.start();
        t4.start();
    }
}

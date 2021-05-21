/*    //Program of synchronized method by using annonymous class

 */
package com.mkpits.java.garbagecollector;
class Table5{
    synchronized void printtable(int n){
        for (int i=1;i<=3;i++){
            System.out.println(n*i);
            try {
                Thread.sleep(400);

            }catch (Exception ee){

            }
        }
    }
}
public class SynchronizationEx5 {
    public static void main(String[] args) {
        Table5 obj = new Table5();
        Thread t5 = new Thread() {
            public void run(){
              obj.printtable(5);
            }
        };
        Thread t6=new Thread(){
            public void run(){
                obj.printtable(10);
            }
        };t5.start();
        t6.start();
    }
}
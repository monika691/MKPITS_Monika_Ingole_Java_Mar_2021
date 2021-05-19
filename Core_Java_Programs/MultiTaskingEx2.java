/*Program of performing two tasks by two threads

 */
package com.mkpits.java.thread;
class simple1 extends Thread{
    public void run(){
        System.out.println("task one");
    }
}class simple2 extends Thread{
    public void run(){
        System.out.println("task two");
    }
}
public class MultiTaskingEx2 {
    public static void main(String[] args) {
simple1 t1=new simple1();
simple2 t2=new simple2();

t1.start();
t2.start();
    }
}

/*MainThreadStack Problem if you direct call run() method

 */
package com.mkpits.java.thread;

public class CallRunEx1 extends Thread{
    public static void main(String[] args) {
        CallRunEx1 cr1=new CallRunEx1();
        CallRunEx1 cr2=new CallRunEx1();
        cr1.run();
        cr2.run();
    }
    public void run() {

        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }System.out.println(i);
        }

    }
}
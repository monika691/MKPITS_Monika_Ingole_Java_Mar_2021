/*/// accoutn class using anonymous class

 */
package com.mkpits.java.garbagecollector;

import java.util.Scanner;

class account{
    int bal=1000;
    synchronized  void deposit(){
        for(int i=1;i<=3;i++){
            System.out.println(Thread.currentThread().getName());
            Scanner s=new Scanner(System.in);
            System.out.println("enter amount to deposited");
            int amt=s.nextInt();
            bal=bal+amt;
            System.out.println("deposited balence is : bal "+bal);

        }
    }
}
public class SynchronizationEx3 {
    public static void main(String[] args) {
        account ac = new account();
        Thread t = new Thread() {
            public void run() {
                ac.deposit();
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {

                }
            }
        };
        t.start();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                ac.deposit();
                try {
                    Thread.sleep(1000);
                } catch (Exception e1) {

                }
            }

        };
        t1.start();

    }
}
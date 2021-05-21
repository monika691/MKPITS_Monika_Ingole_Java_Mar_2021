/*//example account class

 */
package com.mkpits.java.garbagecollector;

import java.util.Scanner;

class account1 {
    int bal = 1000;

    synchronized void deposit() {
        for (int i=1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName());
            Scanner s = new Scanner(System.in);
            System.out.println("Enter amount to be deposited");
            int amt = s.nextInt();
            bal = bal + amt;
            System.out.println("deposited balance is : bal " + bal);

        }
    }
}class accountthread1 extends Thread{
    account act;
    public accountthread1(account act){
        this.act=act;
    }public void run(){
            act.deposit();
            try {
                Thread.sleep(1000);
            }catch (Exception ee){

            }
        }
    }
class accountthread2 extends Thread{
    account act;
    public accountthread2(account act){
        this.act=act;
    }public void run(){
        act.deposit();
        try {
            Thread.sleep(1000);
        }catch (Exception ee){

        }
    }
}
public class SynchronizationEx4 {
    public static void main(String[] args) {
        account ac=new account();
        accountthread1 ac1=new accountthread1(ac);
        ac1.start();
        accountthread2 ac2=new accountthread2(ac);
        ac2.start();
    }
}

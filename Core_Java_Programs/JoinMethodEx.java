/*Example of join(long miliseconds) method

 */
package com.mkpits.java.thread;

public class JoinMethodEx extends Thread{
    public static void main(String[] args) {
        JoinMethodEx jm=new JoinMethodEx();
        JoinMethodEx jm1=new JoinMethodEx();
        JoinMethodEx jm2=new JoinMethodEx();
        jm.start();
        try {
            jm.join(1500);
        }catch (Exception e){
            System.out.println(e);
        }jm1.start();
        jm2.start();
    }public void run(){

        for (int i=1;i<=5;i++){
            try{
                Thread.sleep(1500);
            }catch (Exception e){
                System.out.println(e);
            }System.out.println(i);
        }

    }
}

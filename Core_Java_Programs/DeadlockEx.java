/*Example of Deadlock in java

 */
package com.mkpits.java.synchronised;

public class DeadlockEx {
    public static void main(String[] args) {
        final String resource1="monika";
        final String resource2="nilima";

        //t1 try to lock first resource1 then resource2
        Thread t1=new Thread(){
            public void run(){
                synchronized (resource1){
                    System.out.println("Thread 1: locks resource 1");
                    try{
                        Thread.sleep(1000);
                    }catch (Exception e){

                    }synchronized (resource2){
                        System.out.println("Thread 1 : locks resource 2");
                        try {
                            {
                                Thread.sleep(1000);
                            }
                        }catch (Exception e){

                        }
                    }
                }
            }
        };
        //t2 locks resource2 first then resource1
            Thread t2=new Thread(){
            public void run(){
                synchronized (resource2){
                    System.out.println("Thread 2:locks resource2");
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){

                    }synchronized (resource1){
                        System.out.println("Thread 2:locks resource 1");
                        try {
                            Thread.sleep(1000);
                        }catch (Exception e){

                        }
                    }
                }
            }
        };t1.start();
        t2.start();
    }
}
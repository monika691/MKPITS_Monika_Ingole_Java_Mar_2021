/*see a simple example of java thread pool using ExecutorService and Executors.

 */
package com.mkpits.java.thread;
import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;

public class WorkerThread implements Runnable {
    private String message;
    public WorkerThread(String s){
        this.message=s;
    }public void run(){
        System.out.println(Thread.currentThread().getName()+"(start) message =" +message);
        processmessage();//call processmessage method to sleep thread for 2 secound
        System.out.println(Thread.currentThread()+"end");
    }private void processmessage(){
        try{
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.getStackTrace();
        }
    }
}
class ThreadPool{
    public static void main(String[] args) {
        ExecutorService executor=Executors.newFixedThreadPool(5);//creating thread pool of 5 thread
        for (int i=0;i<10;i++){
            Runnable worker=new WorkerThread(""+i);
            executor.execute(worker);//calling execute method in executorservice

        }executor.shutdown();
        while (!executor.isTerminated()){

        }System.out.println("finished all thread");
    }
}
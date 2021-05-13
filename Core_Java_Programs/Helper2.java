/*Awt  using timer in elevator(timer class,timertask class) .

 */
package com.mkpits.java.elevatorprogram;

import java.util.Timer;
import java.util.TimerTask;


 class Helper2 extends TimerTask {
        ElevatorEx1 ex;
        int floor;
        Helper2(ElevatorEx1 ex,int floor){
            this.ex=ex;
            this.floor=floor;
        }
        public static int i=0;
        public void run(){
            if(i<floor) {
                ex.ld.setText("closed");
                i=i+1;
                System.out.println("i " + i);
                System.out.println("floor " +floor);
                ex.l.setText("floor " + i);
            }
            else{
                ex.ld.setText("opened");
            }
        }
    }
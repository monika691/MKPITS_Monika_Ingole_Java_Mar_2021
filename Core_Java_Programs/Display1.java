/*Awt  using timer in elevator(timer class,timertask class) .

 */
package com.mkpits.java.elevatorprogram;

public class Display1 {
    public boolean status = false;

    public String setDisplay(boolean b) {
        status = b;
        String str = null;
        if (status == true) {
            str = "on";
        } else if (status == false) {
            str = "off";
        }
        return str;
    }
}
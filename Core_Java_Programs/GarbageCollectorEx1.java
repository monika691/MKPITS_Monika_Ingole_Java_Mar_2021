/*Simple Example of garbage collection in java example1

 */
package com.mkpits.java.garbagecollector;

import java.io.FileOutputStream;

public class GarbageCollectorEx1 {
    public void finalize(){
        System.out.println("finalize method is called");
        try{
            fout.close();
        }catch (Exception e1){

        }
    }
    static FileOutputStream fout;


    public static void main(String[] args) {
        try{
            fout=new FileOutputStream("G://Monika//gc.txt");
            fout.write(44);
        }catch (Exception e){

        }
        GarbageCollectorEx1 gc=new GarbageCollectorEx1();
        gc=null;
        System.gc();
        System.out.println("e1 is detroyed by garbage collector");
    }
}

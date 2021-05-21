/*Simple Example of garbage collection in java

 */
package com.mkpits.java.garbagecollector;

public class GarbageCollectorEx {
    public void finalize(){
        System.out.println("object is garbage collected");
    }
    public static void main(String[] args) {
        GarbageCollectorEx gc=new GarbageCollectorEx();
        GarbageCollectorEx gc1=new GarbageCollectorEx();
        gc=null;
        gc1=null;

        System.gc();

    }
}

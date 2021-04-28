/*6) StringBuffer capacity() method

 */
package com.mkpits.java.Stringbuffer;

public class CapacityMethod {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());//default 16
        sb.append("hello");
        System.out.println(sb.capacity());//
        sb.append("i love java language");
        System.out.println(sb.capacity());//(16*2)+2=34
    }
}

/*7) StringBuffer ensureCapacity() method

 */
package com.mkpits.java.Stringbuffer;

public class EnsureCapacity {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer();
        System.out.println(sb.capacity());//16
        sb.append("hello");
        System.out.println(sb.capacity()); //16
        sb.append("my fav language is java");
        System.out.println(sb.capacity());//(16*2)+2=34
        sb.ensureCapacity(10);
        System.out.println(sb.capacity());//34 not changee
        sb.ensureCapacity(50);//(34*2)+2=70
        System.out.println(sb.capacity());
    }
}

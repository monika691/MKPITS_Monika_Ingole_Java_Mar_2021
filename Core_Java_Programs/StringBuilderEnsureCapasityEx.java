/*7) StringBuilder ensureCapacity() method
 */
package com.mkpits.java.StringBuilder;

public class StringBuilderEnsureCapasityEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        System.out.println(sb.capacity());//16
        sb.append("my fav language is java");
        System.out.println(sb.capacity());//(16*2)+2=34
        sb.ensureCapacity(10);
        System.out.println(sb.capacity());//no change in capasity it remains 34
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());//70
    }
}

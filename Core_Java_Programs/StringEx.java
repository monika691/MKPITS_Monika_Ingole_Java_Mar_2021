/*Java String Example

 */
package com.mkpits.java.string;

public class StringEx {
    public static void main(String[] args) {
        String s1="java"; //creating string java by string literal method
        char[] ch ={'m','o','n','i','k','a'};
        String s2=new String(ch); //converting char arry to new string
        String s3=new String("welcome");//creating java string by new keyword
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

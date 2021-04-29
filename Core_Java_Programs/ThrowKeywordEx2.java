/*Case1: You handle the exception

 */
package com.mkpits.java.throwkeyword;

import java.io.IOException;

class M{
    void method()throws IOException{
        throw new IOException("device error");
    }
}
public class ThrowKeywordEx2 {
    public static void main(String[] args) {
        try {
            M m = new M();
            m.method();
        } catch (Exception e) {
            System.out.println("exception handeled");
        }
        System.out.println("normal flow");
    }
}
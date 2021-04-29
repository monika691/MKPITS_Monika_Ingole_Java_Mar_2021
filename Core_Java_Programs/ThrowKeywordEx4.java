/*B)Program if exception occurs

 */
package com.mkpits.java.throwkeyword;

import java.io.IOException;

class M2{
    void method()throws IOException {
        throw new IOException("device error");
    }
}
public class ThrowKeywordEx4 {
    public static void main(String[] args)throws IOException {
        M2 m=new M2();
        m.method();
        System.out.println("normal flow");

    }

}

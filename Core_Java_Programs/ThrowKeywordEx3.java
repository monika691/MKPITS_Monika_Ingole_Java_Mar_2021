/*A)Program if exception does not occur
 */
package com.mkpits.java.throwkeyword;

import java.io.IOException;

class M1{
    void method()throws IOException {
        System.out.println("device operation performed");
    }
}
public class ThrowKeywordEx3 {
    public static void main(String[] args)throws IOException {
        M1 m=new M1();
        m.method();
        System.out.println("normal flow");

    }

}

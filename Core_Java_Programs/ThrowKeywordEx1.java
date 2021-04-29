/*Java throws example
Let's see the example of java throws clause which describes that checked exceptions can be propagated by throws keyword.
 */
package com.mkpits.java.throwkeyword;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;

public class ThrowKeywordEx1 {
    void m()throws IOException {
        throw new IOException("device error");
    }
    void n()throws IOException{
        m();
    }
    void p(){
        try{
            n();
        }
        catch (Exception e){
            System.out.println("exception handeled");
        }
    }
    public static void main(String[] args) {
        ThrowKeywordEx1 obj=new ThrowKeywordEx1();
        obj.p();
        System.out.println("normal flow");

    }
}

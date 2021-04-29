/*In this example, we also kept the code in a try block that will not throw an exception.
 */
package com.mkpits.java.trycatchblock;

public class TryCatchBlockEx3 {
    public static void main(String[] args) {
        try{
            int data =50/0;//throw an exception
            //runtime exception occurs,rest of  code willnot execute
            System.out.println("rest of the code");
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}

/*, the rest of the code is executed, i.e., the rest of the code statement is printed.
 */
package com.mkpits.java.trycatchblock;

public class TryCatchBlockEx2 {
    public static void main(String[] args) {
        try{
            int data =50/0;//throw an exception
        } // handling the exception
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println(" rest of the code");
    }

}

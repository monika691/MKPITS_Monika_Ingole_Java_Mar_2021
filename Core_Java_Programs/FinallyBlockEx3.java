/*Case 3
Let's see the java finally example where exception occurs and handled.
 */
package com.mkpits.java.finallyblock;

public class FinallyBlockEx3 {
    public static void main(String[] args) {
        try{
            int data=25/0;
            System.out.println(data);
        }catch (ArithmeticException e){System.out.println(e);}
        finally {
            System.out.println("finally block is always worked");
        }System.out.println("rezst of code");
        }
}

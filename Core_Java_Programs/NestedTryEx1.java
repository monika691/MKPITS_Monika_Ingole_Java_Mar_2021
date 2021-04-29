/*Java nested try example
Let's see a simple example of java nested try block.
 */
package com.mkpits.java.trycatchblock;

public class NestedTryEx1 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("going to divide");
                int b = 39 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            try {
                int a[] = new int[5];
                a[5] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println("other statement");
        }
            catch (Exception e){
                System.out.println("handeled");
            }
            System.out.println("rest of rest");
        }
    }


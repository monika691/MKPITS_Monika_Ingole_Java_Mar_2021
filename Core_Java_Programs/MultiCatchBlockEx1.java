/*Example 1
Let's see a simple example of java multi-catch block.
 */
package com.mkpits.java.multiplecatchblock;

public class MultiCatchBlockEx1 {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[5]=30/0;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occur");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exception occur ");
        }
        catch (Exception e){
            System.out.println("parent exception occur");
        }
        System.out.println("rest of code");
    }
}

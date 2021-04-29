/*Example 3
In this example, try block contains two exceptions. But at a time only one exception occurs and its corresponding catch block is invoked.
 */
package com.mkpits.java.multiplecatchblock;

public class MultiCatchBlockEx3 {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[5]=30/0;
            System.out.println(a[10]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException occurs");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occur");
        }
        catch (Exception e){
            System.out.println("parent exception occur");
        }
        System.out.println("rest of code");
    }
}

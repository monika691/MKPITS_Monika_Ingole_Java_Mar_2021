/*Example 2
Let's see a simple example of java multi-catch block.
 */

package com.mkpits.java.multiplecatchblock;

public class MultiCatchBlockEx2 {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            System.out.println(a[10]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException occur");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException occurs");
        }
        catch (Exception e)
        {
            System.out.println("parent exception occur");
        }
        System.out.println("rest of code");
    }
}

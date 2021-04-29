/*In this example, we generate NullPointerException,

 */
package com.mkpits.java.multiplecatchblock;

public class MultiCatchBlockEx5 {
    public static void main(String[] args) {
        try{
            String s=null;
            System.out.println(s.length());
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception occur");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occur");
        }
        catch (Exception e){
            System.out.println("parent exception occur");
        }
        System.out.println("rest of code");
    }
}

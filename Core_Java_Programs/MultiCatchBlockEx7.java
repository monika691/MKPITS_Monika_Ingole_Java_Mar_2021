/*In this example, we have created the validate method that takes integer value as a parameter.
 If the age is less than 18, we are throwing the ArithmeticException otherwise print a message welcome to vote.
 */
package com.mkpits.java.multiplecatchblock;

public class MultiCatchBlockEx7 {
    static void validate(int age) {
        if (age < 18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String[] args) {
        try {

            validate(13);
        } catch (ArithmeticException ee) {
            System.out.println(ee.toString());
        }
        System.out.println("rest of code");
    }
}
/*Let's see a simple example of java custom exception.

 */
package com.mkpits.java.customException;
class InvalidAgeException extends Exception{
    InvalidAgeException(String s)
    {
        super(s);
    }
}
public class CustmExcptnEx1 {
    static void validate(int age) throws InvalidAgeException
    {
        if (age < 18)
            throw new InvalidAgeException("not valid");
        else

            System.out.println("welcome to vote");

    }

    public static void main(String[] args) {
        try {
            validate(13);
        } catch (Exception m) {
            System.out.println("exception occured " + m);
        }
        System.out.println("rest of code");
    }
}
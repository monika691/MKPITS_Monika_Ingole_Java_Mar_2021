/*a Runtime Polymorphism Example: Bank
Bank is a class that provides a method to get the rate of interest
the rate of interest may differ according to banks.
For example, SBI, ICICI, and AXIS banks are providing 8.4%, 7.3%, and 9.7% rate of interest.

 */
package com.mkpits.java.polymorphism;

class Bank1{
float getrateofintrest()
{
    return 0;
    }
}
class SBI extends Bank1{
    float getrateofintrest()
    {
        return 8.4f;
    }
}
class ICICI extends Bank1{
    float getrateofintrest()
    {
        return 7.3f;
    }
}
class Axis extends Bank1{
    float getrateofintrest()
    {
        return 9.7f;
    }
}

public class RunTimePolymrpsmeex2 {
    public static void main(String[] args) {
        Bank1 b;
        b=new SBI();
        System.out.println("SBI Bank rate of intrest is " + b.getrateofintrest());
        b=new ICICI();
        System.out.println("ICICI Bank rate of intrest is " + b.getrateofintrest());
        b=new Axis();
        System.out.println("Axis bank rate of intrest is " +b.getrateofintrest());
    }
}

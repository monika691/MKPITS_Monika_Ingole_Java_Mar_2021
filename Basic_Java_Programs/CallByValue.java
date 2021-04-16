/*1 - call by value  example

 */
package com.mkpits.java.basicprograms;

public class CallByValue {
    public static void changevalue(int num)
    {
        num = num + 100;
        System.out.println("value of num inside function " + num);
    }
    public static void main(String[] args)
    {
        int num=500;
        changevalue(num);
        System.out.println("value of num after caaling function " +num);
    }
}

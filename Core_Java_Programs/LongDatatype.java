/*wap to accept number of long datatype

 */
package com.mkpits.java.basicprogram;
import java.util.*;
public class LongDatatype {
    public static void main(String[] args)
    {
        Long b=327671234567890l;
        Scanner sc=new Scanner(System.in);
        System.out.println("b="+b);
        System.out.println("enter number");
        b=sc.nextLong();
        System.out.println("number ="+b);
    }
}

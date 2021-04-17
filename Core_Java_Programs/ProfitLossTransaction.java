/*11 Write a program in C to read any digit, display in the word

 */

package com.mkpits.java.clanguage;
import java.util.*;
public class ProfitLossTransaction {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int cp,sp,amt;

        System.out.println("Enter cost price");
        cp= sc.nextInt();

        System.out.println("Enter selling price");
        sp= sc.nextInt();

        if(sp > cp)
        {
            amt = sp - cp;
            System.out.println("profit =" + amt);
        } else if(cp > sp)
        {
            amt = cp - sp;
            System.out.println("loss "+ amt);
        }else{
            System.out.println("no profit no loss");
        }
    }
}

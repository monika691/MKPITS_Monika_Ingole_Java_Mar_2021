/*ex : 3 create a class account having field accountno , bal and  method deposit and withdrawl.
        create a subclass saving and override the deposit and withdrawl method.

 */
package com.mkpits.java.methodoverriding;
import java.util.*;

import java.util.*;
class account1{
    int actno;
    int bal=1000;
    String deposit(int actno, int amt)
    {
        return "account class deposit method";
    }
    String withdrawl(int actno, int amt)
    {
        return "account class withdrawl method";
    }
}
class saving1 extends account1{
    int intrest =500;
    String deposit(int actno,int amt)
    {    this.actno=actno;
         bal=bal+amt+intrest;
         return "account deposited for actno" + actno+ " " + "balance" +bal;
    }
    String withdrawl(int actno,int amt) {
        this.actno = actno;
        if (amt > bal)
        {
            return "insuffifient fund";
        }
        {
            bal = bal - amt;
            return "account withdrwal for act no is " + actno + " balance " + bal;
        }
    }

}
public class methodoverridingex4 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter account no");
     int actno =sc.nextInt();
     System.out.println("Enter amount");
     int amt=sc.nextInt();
     System.out.println("Do you want to deposit or withdrawl ");
     String ans=sc.next();
     saving1 act =new saving1();
     String str;
     if(ans.equals("deposit"))
     {
         str=act.deposit(actno,amt);
         System.out.println(str);
     }
     else if (ans.equals("withdrawl"))
     {
         str=act.withdrawl(actno,amt);
         System.out.println(str);
     }
    }
}

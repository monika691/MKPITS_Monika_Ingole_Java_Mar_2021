/*ex 4 create a class account having field accountno , bal and  method deposit and withdrawl.
create a subclass saving inherited from account class and override the deposit and withdrawl method.
create a subclass current  inherited from account  and override the deposit and withdrawl method.

 */
package com.mkpits.java.methodoverridingex;
import java.util.*;
class account{
    int actno;
    int bal=1000;
    String deposit(int actno,int amt)
    {
        return "account class deposit method";
    }
    String withdrawl(int actno,int amt)
    {
        this.actno=actno;
        if(amt>bal)
        {
            return "insufficient balance";
        }
        {
            bal=bal-amt;
            return " Account withdrawl for actno is " +actno + "  " + "balance" +bal;
        }
    }
}
class saving extends account{
    int intrest =500;
    String deposit(int actno,int amt)
    {this.actno=actno;
    bal=bal+amt+intrest;
        return "account deposit for act no is "+actno +"balance" + bal;
    }
}
class current extends account{
    String deposit(int actno,int amt)
    {this.actno=actno;
        bal=bal+amt;
        return "account deposit for act no is "+actno +"balance" + bal;
    }
}

public class accountex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter account no");
        int actno=sc.nextInt();
        System.out.println("enter amount");
        int amt= sc.nextInt();
        System.out.println("Choose accounttype saving or current");
        String acttyp=sc.next();
        System.out.println("Do you want to deposit or withdrawl ");
        String ans= sc.next();
        saving sav=null;
        current cur =null;
        String str;
        if(acttyp.equals("saving"))
        {
            sav =new saving();
            if(ans.equals("deposit"))
            {
                str=sav.deposit(actno,amt);
                System.out.println(str);
            }
            else if(ans.equals("withdrawl"))
            {
                str=sav.withdrawl(actno,amt);
                System.out.println(str);
            }
        }

        if (acttyp.equals("current"))
        {
            cur= new current();
            if(ans.equals("deposit")){
                str=cur.deposit(actno,amt);
                System.out.println(str);
            }
            else if(ans.equals("withdrawls"))
            {
                str=cur.withdrawl(actno,amt);
                System.out.println(str);
            }
        }
    }
}

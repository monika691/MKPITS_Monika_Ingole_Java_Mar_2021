/*example of runtime polymorphism using account, saving and current class

 */
package com.mkpits.java.polymorphism;
import java.util.*;

class account3{
    int actno;
    int bal=1000;
    String deposit(int actno,int amt)
    {
        return "account class deposit method";
    }
    String withdrawl(int actno,int amt)
    {
        this.actno=actno;
        if(amt > bal)
        {
            return "Insufficient Balance";
        }
        {
            bal =bal -amt;
            return "account withdrawl for account no is " +actno+ "balance" + bal;
        }
    }
}
class saving extends account3
{
    int intrest =500;
    String deposit(int actno,int amt)
    {
        this.actno=actno;
        bal = bal +amt +intrest;
        return "account deposited for account no is " + actno + " balance " + bal;
    }
}
class current extends account3
{
    String deposit(int actno,int amt)
    {
        this.actno=actno;
        bal = bal+amt;
        return "account deposited for account no " + actno + " balance " + bal;

    }
}
public class RunTimePolymorphsm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter account no");
        int actno= sc.nextInt();
        System.out.println("choose account saving or current");
        String acttyp= sc.next();
        System.out.println("Do you want to deposit or withdrawl");
        String ans= sc.next();
        System.out.println("Enter amount ");
        int amt= sc.nextInt();

        account3 act=null;
        String str;
        if(acttyp.equals("saving"))
        {
            act= new saving();
        }
        else if (acttyp.equals("current"))
        {
            act =new current();
        }
        else
        {
            System.out.println("invalid account type");
        }
        if(ans.equals("deposit"))
        {
            str=act.deposit(actno, amt);
            System.out.println(str);
        }
        else if(ans.equals("withdrawl"))
        {
            str=act.withdrawl(actno,amt);
            System.out.println(str);
        }
    }
}

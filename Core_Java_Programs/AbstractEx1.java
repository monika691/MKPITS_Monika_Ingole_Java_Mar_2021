package com.mkpits.java.abstractexample;
import java.util.*;
abstract class Account{
    int actno;
    float bal=2000;
    String str="";
    abstract void deposit(float amt);
    abstract void withdrawl(float amt);
    String showbalance()
    {
        str="act no " +actno + " balance " + bal;
        return str;
    }
}
class Saving extends Account{
    int intrest =500;
    //override mathod
    void deposit(float amt)
    {
        bal=bal+amt+intrest;
    }
    void withdrawl(float amt)
    {
        bal=bal-amt;
    }
}
class current extends Account{

    void deposit(float amt)
    {
      bal=bal+amt;
    }
    void withdrawl(float amt)
    {
      bal=bal-amt;
    }
}
public class AbstractEx1 {
    public static void main(String[] args) {
        Account act=null;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Account no");
        int actno=s.nextInt();
        System.out.println("choose acount type saving or current");
        String actyp=s.next();
        System.out.println("do you want to deposit or withdrawl");
        String ans=s.next();
        System.out.println("Enter amount");
        int amt=s.nextInt();

        String result="";

        if(actyp.equals("saving"))
        {
            act = new Saving();
            act.actno=actno;
            if(ans.equals("deposit"))
            {
                act.deposit(amt);
            }
            else if(ans.equals("withdrawl"))
            {
                act.withdrawl(amt);
            }
            result= act.showbalance();
        }
        if(actyp.equals("current"))
        {
            act = new current();
            act.actno=actno;
            if(ans.equals("deposit"))
            {
                act.deposit(amt);
            }
            else if(ans.equals("withdrawl"))
            {
                act.withdrawl(amt);
            }
            result=act.showbalance();
        }
        System.out.println(result);
    }
}

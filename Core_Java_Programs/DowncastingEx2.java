/*6  downcasting example with accepting actype from the user
 */
package com.mkpits.java.downcasting;
import java.util.*;
interface Account1{
    void deposit(int amt);
}
class Saving1 implements Account1{
    public void deposit(int amt)
    {
        System.out.println("deposit of saving");
    }
}
class Current1 implements Account1{
    public void deposit(int amt)
    {
        System.out.println("deposit of current");
    }
}
class call1{
    void invoke(Account1 act)
    {
        if(act instanceof Saving1)
        {
            Saving1 s=(Saving1)act;
            s.deposit(200);
        }
        if(act instanceof Current1)
        {
            Current1 c=(Current1) act;
            c.deposit(200);
        }
    }
}
public class DowncastingEx2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Account1 ac=null;
        System.out.println("enter accounttype saving or current");
        String at= sc.next();
        if(at.equals("Saving1"))
        {
            ac=new Saving1();
        }
        else if (at.equals("Current1"))
    {
            ac=new Current1();
        }
        call1 c= new call1();
        c.invoke(ac);
    }
}

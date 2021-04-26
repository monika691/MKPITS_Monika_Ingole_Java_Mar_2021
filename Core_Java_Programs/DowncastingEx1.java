/*5- example of realtime downcasting example
 */
package com.mkpits.java.downcasting;
interface  Account {void deposit(int amt);}
class Saving implements Account {
    public void deposit(int amt)
    {
        System.out.println("deposit of saving");
    }
}
class Current implements Account{
    public void deposit(int amt)
    {
        System.out.println("deposit of current");
    }
}
class call{
    void invoke(Account act)//upcasting
    {
      if(act instanceof Saving)
      {
          Saving s=(Saving) act;//downcasting
          s.deposit(200);
      }
      if(act instanceof Current)
      {
          Current c=(Current)act;
          c.deposit(200);
      }
    }
}
public class DowncastingEx1 {
    public static void main(String[] args) {
        Account ac=new Current();
        call c=new call();
        c.invoke(ac);
    }
}

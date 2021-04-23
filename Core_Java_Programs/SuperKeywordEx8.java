/*create a parent class account having fields accountno and balance. and constructor with 2 parameters
create a subclass saving inherited from account class having fields interest
and constructor with 3 parameters and from this call parent class constructor.
and a display method, deposit method and withdrawl method.

 */
package com.mkpits.java.superkeyword;

class Account{
    int actno;
    int bal=2000;
    int amt;
    Account(int actno,int amt)
    {
        this.actno=actno;
        this.amt=amt;
    }
   }
class Saving extends Account{
    int intrest=500;
    Saving(int actno,int amt)
    {
        super(actno,amt);
        bal= bal+ amt+ intrest;//reusing parent class
        this.intrest=intrest;
    }
    void display()
    {

        System.out.println("account deposit for account no is : " +actno + " balance : " +bal );
    }
    void deposit()
    {
        int intrest=500;

    }
    void withdrawl()
    {
        bal=bal - amt;
    }
}

public class SuperKeywordEx8 {
    public static void main(String[] args) {

        Saving s =new Saving(5,2000);
        s.display();

    }
}

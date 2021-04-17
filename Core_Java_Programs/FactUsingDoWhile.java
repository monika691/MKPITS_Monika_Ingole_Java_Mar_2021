/*5 do while loop.
        wap to ask whether to continue or not using  do while loop

 */
package com.mkpits.java.basicprograms;
import java.util.*;
public class FactUsingDoWhile {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num,orignum;
        int fact;

        char ans ='y';
        do{
            System.out.println("Enter number");
            num=sc.nextInt();
            orignum=num;
            fact=1;
            while(num>0){
                fact = fact * num;
                num--;
            }System.out.println("factorial of "+orignum +"="+fact);
            System.out.println("do you want to continue press y or n");
            ans=sc.next().charAt(0);
        }while(ans =='y');
    }
}

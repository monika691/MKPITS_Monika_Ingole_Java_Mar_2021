/*2- wap to accept designation and calculate bonus using switch

 */
package com.mkpits.java.basicprograms;
import java.util.*;
public class DesignationBonus {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String designation;
        int bonus=0;
        System.out.println("enter designation");
        designation=sc.next();
        switch(designation){
            case "manager":
                bonus=20000;
                break;
            case "clerk":
                bonus=10000;
                break;
            case "peon":
                bonus=1000;
                break;
            default:
                System.out.println("invalid designation");
                break;
        }System.out.println("bonus " +bonus);

    }
}

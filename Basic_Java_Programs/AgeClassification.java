/*- wap to accept age from the user and display whether he is young, middleaged or old.(if elseif )

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class AgeClassification {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.println("Enter your age");
        age= sc.nextInt();
        if(age>=18 && age<=35)
        {
            System.out.println("You are young");
        }
        else if(age >35 && age<=58)
        {
            System.out.println("You are middleaged");
        }
        else{
            System.out.println("you are old");
        }
    }
}

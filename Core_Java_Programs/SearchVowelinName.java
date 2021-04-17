/*wap to create  a character array of 5 elements
        accept 5 characters from the user
        and then display each character in a new line.
        then search in an array whether a vowel character is present in it or not

 */
package com.mkpits.java.clanguage;
import java.util.*;
public class SearchVowelinName {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        char ch[]=new char[5];
        int cnt;
        for(cnt=0;cnt<5;cnt++)
        {
            System.out.println("Enter any character");
            ch[cnt]=sc.next().charAt(0);
        }
        for(cnt=0;cnt<5;cnt++)
        {
            System.out.println("Entered character is  "+cnt+'='+ch[cnt]);
        }
        for(cnt=0;cnt<5;cnt++)
        {
            if(ch[cnt]=='a') {
                System.out.println("character is vowel " +ch[cnt]+cnt);
            }
           else if(ch[cnt]=='e') {
                System.out.println("it is vowel " +ch[cnt] +cnt);
            }
           else if(ch[cnt]=='i') {
                System.out.println("character  is vowel " +ch[cnt] +cnt);
            }
           else if(ch[cnt]=='o') {
                System.out.println("it is vowel " +ch[cnt] +cnt);
            }
            else if(ch[cnt]=='u') {
                System.out.println("it is vowel "+ch[cnt] +cnt);
            }

        }
    }

}

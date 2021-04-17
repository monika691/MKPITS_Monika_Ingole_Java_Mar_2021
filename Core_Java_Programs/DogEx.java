/*10 create a class dog having fields breed , height and color and methods getdata and showdata and bark

 */
package com.mkpits.java.basicprograms;
import java.util.*;
public class DogEx {
    static class Dog{
        String breed;
        int height;
        String color;
        void getdata(String b,int h,String c)
        {
            breed=b;
            height=h;
            color=c;
        }
        void showdata()
        {
            System.out.println("Dog breed : " +breed);
            System.out.println("Dog height : " +height);
            System.out.println("Dog color : " +color);
        }
    }
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        Dog d = new Dog();
        System.out.println("Enter dog breed,height and color");
        String b= sc.next();
        int h=sc.nextInt();
        String c=sc.next();
        d.getdata(b,h,c);
        d.showdata();
    }
}

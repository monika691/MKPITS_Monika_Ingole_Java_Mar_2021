package com.mkpits.java.basicprograms;

public class EnhanceLoop2 {
    public static void main(String[] args)
    {
        int num[] = new int[3];
        num[0]=11;
        num[1]=12;
        num[2]=13;

        for(int n:num)
        {
            System.out.println("num " + n);
        }
    }
}

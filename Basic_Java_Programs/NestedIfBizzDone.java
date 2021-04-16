 /*NESTED IF
        WAP TO ACCEPT NUMOFYEARSWITHUS AND BIZDONE WITH US AND DISPLAY MSG "CLASSIFIED AS MVS"
        IF NUMOFYEARSWITHUS IS GREATER THAN 10 YEARS AND BIZDONE IS MORE THAN 5000000
        OTHERWISE DISPLAY MSG "LITTE MORE EFFORT IS REQUIRED"
  *

  */
  package com.mkpits.java.clanguage;

import java.util.*;
public class NestedIfBizzDone {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int numofyr,bizdone;
        System.out.println("Enter number of yr and bizzdone");
        numofyr= sc.nextInt();
        bizdone= sc.nextInt();
        if(numofyr>10)
        {
            if(bizdone>5000000)
            {
                System.out.println("classified as mvs");
            }

            }else{
            System.out.println("need more efforts");
        }
    }
}

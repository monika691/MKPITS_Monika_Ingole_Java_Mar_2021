package com.mkpits.java.exceptionpropogation;

import java.io.IOException;

public class ExceptionPropogationEx4 {
    void m(){
        try
        {
            throw new java.io.IOException("device error");//checked exception
        }catch(Exception ee)
        {
            System.out.println(ee);
        }
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handeled");}
    }
    public static void main(String args[]){
        ExceptionPropogationEx4 obj=new ExceptionPropogationEx4();
        obj.p();
        System.out.println("normal flow");
    }
}



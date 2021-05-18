package com.mkpits.java.thread;

public class JoinMethodEx1 extends Thread{
    public static void main(String[] args) {
        JoinMethodEx1 jm=new JoinMethodEx1();
        JoinMethodEx1 jm1=new JoinMethodEx1();
        System.out.println("name of jm: "+jm.getName());
        System.out.println("name of jm2: "+jm1.getName());
        System.out.println("id of jm : "+jm.getId());

        jm.start();
        jm1.start();
        jm.setName("mkpits");
        System.out.println("name change of jm after " + jm.getName());
    }public void run(){
        System.out.println("running");
    }
}

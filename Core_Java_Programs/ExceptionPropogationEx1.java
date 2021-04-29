/*Program of Exception Propagation

 */
package com.mkpits.java.exceptionpropogation;

public class ExceptionPropogationEx1 {
    void m(){
        int data=50/0;
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        }catch (Exception e){
            System.out.println("exception handeled");
        }
    }

    public static void main(String[] args) {
        ExceptionPropogationEx1 obj=new ExceptionPropogationEx1();
        obj.p();
        System.out.println("normal flow");
    }

}

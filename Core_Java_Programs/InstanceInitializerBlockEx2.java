/*InstanceInitializerBlockEx2

 */
package com.mkpits.java.instanceinitialiserblock;

class A2{
    int n=0;
    A2(){
        System.out.println("parent class is invoked");
    }
}
class B3 extends A2
{
    B3() {
        super();
        System.out.println("child class is invoked");
        System.out.println("n = " + n);
    }


B3(int a) {
    super();
    System.out.println("child class is invoked " + a);
    System.out.println("n = " + n);
}
    {
        System.out.println("instance initializer block is invoked");
        n = n + 1;
    }

    public static void main(String[] args)
{
        B3 b=new B3();
        B3 b1=new B3(10);
    }

}
/*1) Method Overloading: changing no. of arguments

 */
package com.mkpits.java.methodoverloading;
class calculate1 {
    static int Addition(int n1,int n2)
    {
        return n1+n2;
    }
    static int Addition(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }
}
 class over {
    public static void main(String[] args) {
        calculate1 cal=new calculate1();
        int res = cal.Addition(2,3);
        System.out.println("Add of 2 no is " +res);
        res = cal.Addition(2,3,4);
        System.out.println("Add of 3 no is " +res);
    }
}

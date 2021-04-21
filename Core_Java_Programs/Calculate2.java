/*2) Method Overloading: changing data type of arguments

 */
package com.mkpits.java.changeindatatype;

 class Calculate2 {
    static int addition(int n1,int n2)
    {
        return n1+n2;
    }
    float addition(float n1,float n2)
    {
        return n1+n2;
    }
    double addition(double n1,double n2)
    {
        return n1+n2;
    }
}
class changedata{
    public static void main(String[] args) {
        Calculate2 cal = new Calculate2();
        int res =cal.addition(6,4);
        System.out.println("add of 2 integer is " +res);

        float  res1 = cal.addition(6.5f,4.5f);
        System.out.println("add of 2 float is " +res1);

         double res2 =cal.addition(64.654,41.2);
        System.out.println("add of 2 double is " +res2);
    }
}
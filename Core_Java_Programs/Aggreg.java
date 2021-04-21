package com.mkpits.java.agregation;
class operation{
    int square(int n)
    {
        int sq =n*n;
        return sq;
    }
}
class circle{
    operation op;
    float pi =3.14f;
    float area(int n)
    {
        op =new operation();
        float a =pi * op.square(n);
        return a;

    }
}
public class Aggreg {
    public static void main(String[] args) {
        circle c=new circle();
        float ans=c.area(3);
        System.out.println("area of circle =" + ans);
    }

}

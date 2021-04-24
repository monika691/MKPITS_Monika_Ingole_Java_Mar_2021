package com.mkpits.java.sb;
interface Bank{
    float rateofintrest();
}
class SBI implements Bank{
    public float rateofintrest()
    {
        return 9.17f;
    }
}
class PNB implements  Bank{
    public float rateofintrest() {
        return 9.7f;
    }
}
public class InterfaceEx3 {
    public static void main(String[] args) {
        Bank b= new SBI();
        System.out.println("ROI : " +b.rateofintrest());
    }
}

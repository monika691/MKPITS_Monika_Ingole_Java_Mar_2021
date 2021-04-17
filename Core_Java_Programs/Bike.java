/*1- default constructor

 */
public class Bike {
    String color;
    public Bike()
    {
        color="Blue";
        System.out.println("Bike is created");
    }
    public static void main(String[] arg)
    {
        Bike b=new Bike();
        System.out.println("Bike color " + b.color);
    }
}

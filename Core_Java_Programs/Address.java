package com.mkpits.java.agregation;

public class Address {
    String city;
    String state;
    String country;
    public  Address(String city,String state,String country)
    {
        this.city=city;
        this.state=state;
        this.country=country;
    }
}
 class employee
{
    int id;
    String name;
    Address address;
    public employee(int id,String name,Address address)
    {
        this.id=id;
        this.name=name;
        this.address=address;
    }
    void display()
    {
        System.out.println(id + " : " +name);
        System.out.println(address.city+":" +address.state +":" +address.country);
    }
}
class aggregation {
    public static void main(String[] arg) {
        Address adr = new Address("Amt", "Maharashtra", "India");
        Address adr1 = new Address("Banglore", "Karnataka", "India");

        employee emp = new employee(11, "Monika", adr);
        employee emp1 = new employee(12, "Nahush", adr1);

        emp.display();
        emp1.display();
    }
}
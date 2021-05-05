/*registration form code

 */
package com.mkpits.java.checkboxgroup;
import java.awt.*;
public class RegistrationForm {
    Label l1,l2,l3,l4;
    TextField t;
    Button b;
    RegistrationForm(){
        Frame f=new Frame("Registration form");
        l1=new Label("Register yourself");
        l1.setBounds(200,50,100,20);
        f.add(l1);
        l2=new Label("your name");
        l2.setBounds(10,120,100,20);
        f.add(l2);

        TextField t=new TextField();
        t.setBounds(130,120,100,20);
        f.add(t);

        l3=new Label("select course");
        l3.setBounds(10,170,100,20);
        f.add(l3);

        Checkbox cb1=new Checkbox("c++",false);
        cb1.setBounds(130,150,50,50);

        Checkbox cb2=new Checkbox("Java",true);
        cb2.setBounds(200,150,50,50);

        l4=new Label("select gender");
        l4.setBounds(10,210,100,20);
        f.add(l4);

        CheckboxGroup cbg=new CheckboxGroup();
        Checkbox cb3=new Checkbox("Male",cbg,false);
        cb3.setBounds(120,200,50,50);
        Checkbox cb4=new Checkbox("Female",cbg,true);
        cb4.setBounds(180,200,80,50);

        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(cb4);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);


    }

    public static void main(String[] args) {
        RegistrationForm rf=new RegistrationForm();
    }
}

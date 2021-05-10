package com.mkpits.java.register;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register {
    Label l1,l2,l3,l4;
    TextField tf;
    Button b;
    Register(){
        Frame f=new Frame("checkbox group example");
        Label l=new Label("register yourself");

        l1=new Label("enter your name");
        l1.setBounds(10,100,100,30);
        f.add(l1);

        TextField tf1=new TextField();
        tf1.setBounds(120,100,80,30);
        f.add(tf1);

        l2=new Label("course");
        l2.setBounds(10,150,80,20);
        f.add(l2);

        Checkbox cb1=new Checkbox("c++",false);
        cb1.setBounds(100,150,80,20);
        f.add(cb1);
        Checkbox cb2=new Checkbox("Java",true);
        cb2.setBounds(180,150,80,20);
        f.add(cb2);

        l3=new Label("gender");
        l3.setBounds(10,200,80,20);
        f.add(l3);
        CheckboxGroup cbg=new CheckboxGroup();
        Checkbox cbg3=new Checkbox("male",cbg,false);
        cbg3.setBounds(100,200,80,20);
        Checkbox cbg4 =new Checkbox("female",cbg,true);
        cbg4.setBounds(180,200,80,20);
        f.add(cbg3);
        f.add(cbg4);

        l4=new Label("city");
        l4.setBounds(10,250,80,20);
        f.add(l4);

        Choice c=new Choice();
        c.setBounds(90,250,100,20);
        c.add("Amravati");
        c.add("Nagpur");
        c.add("Pune");
        c.add("Mumbai");
        f.add(c);

        TextArea a=new TextArea("info : ");
        a.setBounds(50,350,250,150);
        f.add(a);

        Button b=new Button("Result");
        b.setBounds(20,300,80,20);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n=tf1.getText();
                String cc=null;
                if(cb1.getState()==true);
                cc="c++";
                if(cb2.getState()==true);
                cc=cc+ "java";
                String g=null;
                if(cbg3.getState()==true);
                g="male";
                if(cbg4.getState()==true);
                g="female";
                String city=c.getItem(c.getSelectedIndex());
                Registerclass reg=new Registerclass(n,cc,g,city);
                StringBuilder sb=new StringBuilder();
                sb.append("name : " +reg.name + "\n");
                sb.append("course : " +reg.course + "\n");
                sb.append("gender : "+ reg.gender + "\n");
                sb.append("city : "+reg.city + "\n");
                a.setText(sb.toString());
            }
        });
        f.setLayout(null);
        f.setSize(400,500);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Register();
    }
}

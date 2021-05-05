/*register form code

 */
package com.mkpits.java;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm {
    Label l1,l2,l3,l4;
    TextField t;
    Button b;
    RegistrationForm(){
        Frame f=new Frame();
        l1=new Label("Register yourself");
        l1.setBounds(200,50,100,20);
        f.add(l1);
        l2=new Label("your name");
        l2.setBounds(10,120,100,20);
f.add(l2);
        t=new TextField();
        t.setBounds(130,120,100,20);
        f.add(t);

        l3=new Label("select course");
        l3.setBounds(10,170,100,20);
        f.add(l3);

        Checkbox cb1=new Checkbox("C++",false);
        cb1.setBounds(130,150,50,50);
        Checkbox cb2=new Checkbox("Java ",true );
        cb2.setBounds(200,150,50,50);
        f.add(cb1);
        f.add(cb2);

        l4=new Label("select gender");
        l4.setBounds(10,210,100,20);
        f.add(l4);

        CheckboxGroup cbg=new CheckboxGroup();
        Checkbox cbg3=new Checkbox("Male ",cbg,false);
        cbg3.setBounds(120,200,50,50);
        Checkbox cbg4=new Checkbox("Female",cbg,true);
        cbg4.setBounds(180,200,50,50);
        f.add(cbg3);
        f.add(cbg4);

        Label l5=new Label("select city");
        l5.setBounds(10,250,100,20);
        f.add(l5);
        Choice c=new Choice();
        c.setBounds(130,250,75,75);
        c.add("Amravati");
        c.add("Nagpur");
        c.add("Pune");
        c.add("Mumbai");
        f.add(c);

        Label lq=new Label("info : ");
        lq.setBounds(200,150,100,20);
        f.add(lq);

        Button b=new Button("register");
        b.setBounds(150,300,100,30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb=new StringBuilder();
                sb.append("name "+t.getText());
                if(cb1.getState()==true);
                sb.append("course : C++");
                if(cb2.getState()==true);
                sb.append("course : Java");
                if(cbg3.getState()==true);
                sb.append("gender : Male");
                if(cbg4.getState()==true);
                sb.append("gender : Female");
                sb.append("city "+c.getItem(c.getSelectedIndex()));
                lq.setText(sb.toString());
            }
        });
        f.add(b);
        f.setLayout(null);
        f.setSize(700,500);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}

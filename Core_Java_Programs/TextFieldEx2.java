/*Java AWT TextField Example with ActionListener

 */
package com.mkpits.java.textfield;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldEx2 extends Frame implements ActionListener {
    TextField t1,t2,t3;
    Button b1,b2;
    TextFieldEx2(){
        t1=new TextField();
        t1.setBounds(50,50,100,30);

        t2=new TextField();
        t2.setBounds(50,100,100,30);

        t3=new TextField();
        t3.setBounds(50,150,100,30);
        t3.setEditable(false);

        b1=new Button("+");
        b1.setBounds(50,200,50,50);
        b2=new Button("-");
        b2.setBounds(150,200,50,50);
        b1.addActionListener(this);
        b2.addActionListener(this);

        add(t1);add(t2);add(t3);add(b1);add(b2);
        setLayout(null);
        setSize(400,400);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
    String s1=t1.getText();
    String s2=t2.getText();
    int a=Integer.parseInt(s1);
    int b=Integer.parseInt(s2);
    int c=0;
    if(ae.getSource()==b1){
    c=a+b;}
    else if(ae.getSource()==b2)
{
        c = a - b;
    }String result =String.valueOf(c);
    t3.setText(result);
}

    public static void main(String[] args) {
        new TextFieldEx2();
    }
}
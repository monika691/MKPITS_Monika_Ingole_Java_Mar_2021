/*wrp of product order  details using awt

 */
package com.mkpits.java.awtswing;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class AwtOrderEx {
    AwtOrderEx(){
        Frame f=new Frame();
        Label l1=new Label("Order no");
        l1.setBounds(10,50,80,20);
        f.add(l1);
        TextField t1=new TextField();
        t1.setBounds(90,50,80,20);
        f.add(t1);

        Label l2=new Label("Product ");
        l2.setBounds(10,100,80,20);
        f.add(l2);
        TextField t2=new TextField();
        t2.setBounds(90,100,80,20);
        f.add(t2);

        Label l3=new Label("Qty");
        l3.setBounds(10,150,80,20);
        f.add(l3);
        TextField t3=new TextField();
        t3.setBounds(90,150,80,20);
        f.add(t3);

        Label l4=new Label("Rate");
        l4.setBounds(10,200,80,20);
        f.add(l4);
        TextField t4=new TextField();
        t4.setBounds(90,200,80,20);
        f.add(t4);

        TextArea t=new TextArea("Info : ");
        t.setBounds(10,300,350,80);
        f.add(t);

        Button b=new Button("Order");
        b.setBounds(10,250,80,20);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String product_name ;
                int qty;
                int rate;
                StringBuilder sb=new StringBuilder();

                qty=Integer.parseInt(t3.getText());
                rate=Integer.parseInt(t4.getText());
                sb.append("order no is : " + t1.getText() + "\n" );
                sb.append("product name:" +t2.getText() + "\n" );

                int total_amount;

                total_amount= qty*rate;
                sb.append("total amount is : " + total_amount + "\n" );
                t.setText(sb.toString() + "\n");
            }
        });
        f.setLayout(null);
        f.setSize(400,600);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new AwtOrderEx();
    }
}

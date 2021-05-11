/*wrp of print table using awt

 */
package com.mkpits.java.awtswing;


import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import javax.swing.*;

public class AwtPrintTableEx {
    AwtPrintTableEx(){
        JFrame f=new JFrame();
        JLabel t=new JLabel("enter number");
        t.setBounds(10,50,100,30);
        f.add(t);
        JTextField t1=new JTextField();
        t1.setBounds(110,50,100,30);
        f.add(t1);
        JTextArea t2=new JTextArea();
        t2.setBounds(50,250,100,200);
        f.add(t2);
        Button b=new Button("table");
        b.setBounds(50,200,100,30);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb=new StringBuilder();
                int num=0,i,res=0;
                num=(Integer.parseInt(t1.getText()));

                for( i=1;i<=10;i++) {
                    res = num * i;
                    sb.append(num + "*" + i + "=" + res + "\n");
                }
                t2.setText(sb.toString());

            }
        });
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        AwtPrintTableEx a=new AwtPrintTableEx();
    }
}


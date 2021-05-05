package com.mkpits.java;

/*Java AWT CheckboxGroup Example with ItemListener

 */
//package com.mkpits.java.c;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class AwtEx5 {
    AwtEx5(){
        JFrame f =new JFrame();
        JLabel l1=new JLabel("enter number");
        l1.setBounds(10,50,100,30);
        f.add(l1);
        JTextField t1=new JTextField();
        t1.setBounds(110,50,100,30);
        f.add(t1);
        JLabel l2=new JLabel();
        l2.setBounds(50,250,100,30);
        f.add(l2);
        Button b1=new Button("prime no");
        b1.setBounds(50,200,100,30);
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i,m=0,flag=0;
                int n= Integer.parseInt(t1.getText());
                m=n/2;
                if(n==0||n==1){
                    l2.setText(n+" is not prime number");
                }else{
                    for(i=2;i<=m;i++){
                        if(n%i==0){
                            l2.setText(n+" is not prime number");
                            flag=1;
                            break;
                        }
                    }
                    if(flag==0){
                        l2.setText(n+" is prime number");
                    }
                }//end of else

            }
        });
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new AwtEx5();
    }
}


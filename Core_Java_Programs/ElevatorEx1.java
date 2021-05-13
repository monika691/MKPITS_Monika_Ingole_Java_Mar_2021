/*Awt  using timer in elevator(timer class,timertask class) .

 */
package com.mkpits.java.elevatorprogram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class ElevatorEx1 {
    public static JLabel l;
    public static JButton b;
    public static Timer timer;
    public static JButton b1,b2,bfan,blight,bdoor;
    public static int tc;
    public static JLabel ld;
    static void ElevatorEx1(){
        Display1 dis=new Display1();
        JFrame f=new JFrame("ElevatorEx1");
        JPanel p=new JPanel();
        p.setBounds(20,50,200,350);
        p.setBackground(Color.DARK_GRAY);
        p.setLayout(null);
        f.add(p);

        JPanel p1=new JPanel();
        p1.setBounds(20,50,100,100);
        p1.setBackground(Color.lightGray);
        p1.setLayout(null);
        l=new JLabel("Floor 0");
        l.setBounds(20,50,80,30);
        p1.add(l);
        p.add(p1);

        JPanel p2=new JPanel();

        p2.setBounds(20,200,150,120);
        p2.setBackground(Color.yellow);
        p2.setLayout(null);
        final JLabel l1=new JLabel("fan");
        l1.setBounds(10,25,80,30);
        final JLabel lf=new JLabel("off");
        lf.setBounds(90,25,80,30);

        final JLabel l2=new JLabel("light");
        l2.setBounds(10,50,80,30);
        final JLabel ll=new JLabel("off");
        ll.setBounds(90,50,80,30);

        final JLabel l3=new JLabel("Door");
        l3.setBounds(10,75,80,30);
         ld=new JLabel("opened");
        ld.setBounds(90,75,80,30);

        p2.add(l1);
        p2.add(lf);
        p2.add(l2);
        p2.add(ll);
        p2.add(l3);
        p2.add(ld);
        p.add(p2);

        JPanel p3=new JPanel();
        p3.setBounds(250,50,200,350);
        p3.setBackground(Color.lightGray);
        p3.setLayout(null);
        f.add(p3);

        b=new JButton("0");
        b.setBounds(10,50,80,20);
        p3.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             Timer timer=new Timer();
             TimerTask task=new Helper2(new ElevatorEx1(),0);
             timer.schedule(task,5000,5000);
            }
        });
        b1=new JButton("1");
        b1.setBounds(110,50,80,20);
        p3.add(b1);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              Timer timer=new Timer();
              TimerTask task=new Helper2(new ElevatorEx1(),1);
              timer.schedule(task,5000,5000);
            }
        });
        b2=new JButton("2");
        b2.setBounds(10,100,80,20);
        p3.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 Timer timer=new Timer();
                 TimerTask task=new Helper2(new ElevatorEx1(),2);
                 timer.schedule(task,5000,5000);
            }
        });

        bdoor =new JButton("Door");
        bdoor.setBounds(110,100,80,20);
        p3.add(bdoor);
        bdoor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String f = ld.getText();
                String res = null;
                if (f.equals("opened")) {
                    res = dis.setDisplay(false);
                    if (res.equals("on"))
                        ld.setText("opened");
                    else
                        ld.setText("closed");
                } else {
                    res = dis.setDisplay(true);
                    if (res.equals("on"))
                        ld.setText("opened");
                    else
                        ld.setText("closed");

                }
            }

        });
                bfan=new JButton("fan");
                bfan.setBounds(10,150,80,20);
                p3.add(bfan);
                bfan.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String f=lf.getText();
                        if(f.equals("off")) {
                            lf.setText(dis.setDisplay(true));
                        } else{
                                        lf.setText(dis.setDisplay(false));
                        }
                    }
                });
                blight=new JButton("light");
                blight.setBounds(110,150,80,20);
                p3.add(blight);
                blight.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String f=ll.getText();
                        if(f.equals("off")){
                            ll.setText(dis.setDisplay(true));
                        }else{
                            ll.setText(dis.setDisplay(false));
                        }
                    }
                });

                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setLayout(null);
                f.setSize(500,500);
                f.setVisible(true);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ElevatorEx1();
            }
        });
    }

}

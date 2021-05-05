/*Java AWT Label Example with ActionListener

 */
package com.mkpits.java.labelexample;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabelEx2 extends Frame implements ActionListener {
    TextField t;
    Label l;
    Button b;

    LabelEx2() {
        t = new TextField();
        t.setBounds(50, 50, 150, 30);
        l = new Label();
        l.setBounds(50, 100, 150, 30);
        Button b = new Button("find ip");
        b.setBounds(50, 150, 60, 30);
        b.addActionListener(this);
        add(t);
        add(l);
        add(b);
        setLayout(null);
        setSize(400, 400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String host = t.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("Ip of " + host + "is " + ip);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new LabelEx2();
    }
}
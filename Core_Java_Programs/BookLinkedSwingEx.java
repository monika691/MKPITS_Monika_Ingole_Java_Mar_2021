/*Book programs in awt or swing using linkedlist

 */
package com.mkpits.java.collection;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.LinkedList;

public class BookLinkedSwingEx extends JFrame {
    JLabel l1,l2,l3,l4,l5;
    JTextField tf1,tf2,tf3,tf4,tf5;
    JButton b1,b2,b3;
    JTextArea ta;
    LinkedList<String> book=new LinkedList<String>();
    BookLinkedSwingEx(){
        l1=new JLabel("Book id");
        l1.setBounds(10,50,100,30);
        add(l1);
        tf1=new JTextField();
        tf1.setBounds(110,50,100,30);
        add(tf1);

        l2=new JLabel("Book Name");
        l2.setBounds(10,100,100,30);
        add(l2);
        tf2=new JTextField();
        tf2.setBounds(110,100,100,30);
        add(tf2);

        l3=new JLabel("Book Author");
        l3.setBounds(10,150,100,30);
        add(l3);
        tf3=new JTextField();
        tf3.setBounds(110,150,100,30);
        add(tf3);

        l4=new JLabel("Book Publication");
        l4.setBounds(10,200,100,30);
        add(l4);
        tf4=new JTextField();
        tf4.setBounds(110,200,100,30);
        add(tf4);

        l5=new JLabel("Book Quantity");
        l5.setBounds(10,250,100,30);
        add(l5);
        tf5=new JTextField();
        tf5.setBounds(110,250,100,30);
        add(tf5);

        b1=new JButton("Add Book");
        b1.setBounds(20,300,100,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                book.add(tf1.getText());
                book.add(tf2.getText());
                book.add(tf3.getText());
                book.add(tf4.getText());
                book.add(tf5.getText());

                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
                tf4.setText("");
                tf5.setText("");


            }
        });add(b1);
        b2=new JButton("Display Book");
        b2.setBounds(130,300,100,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               StringBuilder sb=new StringBuilder();
               for (String str : book){

                   sb.append("book :"+str +"\n");
                   ta.setText(sb.toString());
               }

            }
        });add(b2);

        ta=new JTextArea("details");
        ta.setBounds(10,350,200,200);
        add(ta);

        setLayout(null);
        setSize(500,500);
        setVisible(true);
    }


    public static void main(String[] args) {
        BookLinkedSwingEx bcs=new BookLinkedSwingEx();
    }
}

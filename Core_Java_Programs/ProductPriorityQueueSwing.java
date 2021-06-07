/*program to create collection of products using priority quee class in swing.


 */
package com.mkpits.java.collection;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.PriorityQueue;

class Product1 implements Comparable<Product> {
    int id;
    String productname;
    int price;

    public Product1(int id, String productname, int price) {
        this.id = id;
        this.productname = productname;
        this.price = price;
    }

    public int compareTo(Product p) {
        if (id > p.id) {
            return 1;
        } else if (id < p.id) {
            return -1;
        } else {
            return 0;
        }
    }
}
public class ProductPriorityQueueSwing extends JFrame {
    JLabel l1,l2,l3;
    JButton b1,b2,b3;
    JTextField tf1,tf2,tf3;
    JTextArea ta;
    PriorityQueue<String> queue=new PriorityQueue<String>();
    ProductPriorityQueueSwing(){
        l1=new JLabel("Product id");
        l1.setBounds(10,50,100,30);
        add(l1);
        tf1=new JTextField();
        tf1.setBounds(110,50,100,30);
        add(tf1);

        l2=new JLabel("Product Name");
        l2.setBounds(10,100,100,30);
        add(l2);
        tf2=new JTextField();
        tf2.setBounds(110,100,100,30);
        add(tf2);

        l3=new JLabel("Product Price");
        l3.setBounds(10,150,100,30);
        add(l3);
        tf3=new JTextField();
        tf3.setBounds(110,150,100,30);
        add(tf3);

        b1=new JButton("Add");
        b1.setBounds(20,200,80,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pd=new String();
                pd=("id : " + tf1.getText() + "\n"+ "name : " + tf2.getText() + "\n" + "price : " + tf3.getText());
                queue.add(pd);
                tf1.setText(" ");
                tf2.setText(" ");
                tf3.setText(" ");
            }
        });add(b1);

        b2=new JButton("Display");
        b2.setBounds(110,200,80,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              StringBuilder sb=new StringBuilder();
              for (String product : queue){
                  sb.append("details : "+ product );
                  ta.setText(sb.toString());
              }
            }
        });add(b2);

        ta=new JTextArea("Details");
        ta.setBounds(10,250,200,200);
        add(ta);

        setLayout(null);
        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        ProductPriorityQueueSwing ppq=new ProductPriorityQueueSwing();
    }
}

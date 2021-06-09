/*a simple of Java socket programming where client sends a text and server receives and prints it.

 */
package com.mkpits.java.networkingclient;

import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF("hello from client");
            dos.flush();
            dos.close();
            s.close();
System.out.println("messege sent to server");

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
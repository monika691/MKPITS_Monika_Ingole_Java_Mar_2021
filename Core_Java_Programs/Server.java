/*a simple of Java socket programming where client sends a text and server receives and prints it.

 */
package com.mkpits.java.networking;

import java.net.ServerSocket;
import java.io.*;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            System.out.println("server ready to accept connection");
            Socket s=ss.accept();//establish connection

            DataInputStream dis=new DataInputStream(s.getInputStream());
            String str=(String) dis.readUTF();
            System.out.println("message  " + str);
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}


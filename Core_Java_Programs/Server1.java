package com.mkpits.java.networking;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
    public static void main(String[] args) {
        try{
            ServerSocket ss1=new ServerSocket(3333);
            System.out.println("server is ready to accept connection");
            Socket s1=ss1.accept();

            DataInputStream dis1=new DataInputStream(s1.getInputStream());
            DataOutputStream dos=new DataOutputStream(s1.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            String str=" ",str2="";
            while(!str.equals("Stop")) {
                str = dis1.readUTF();
                System.out.println("client say : " + str);
                str2 = br.readLine();
                dos.writeUTF(str2);
                dos.flush();

                dis1.close();
                ss1.close();
                s1.close();

            }

        }catch (Exception e){
System.out.println(e.toString());
        }
    }
}

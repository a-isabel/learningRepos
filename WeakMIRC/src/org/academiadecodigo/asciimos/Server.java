package org.academiadecodigo.asciimos;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class Server {


    public static void main(String[] args) {

        try {

            DatagramSocket socket = new DatagramSocket(26465);
            byte[] buffer = new byte[1024];
            DatagramPacket receivePacket = null;

            while (true) {

                receivePacket = new DatagramPacket(buffer, buffer.length);
                socket.receive(receivePacket);
                System.out.println("Client: " + data(buffer).toUpperCase());

                if (data(buffer).equals("out")) {

                    System.out.println("Client said 'out'. ");
                    System.out.println("________________________________");
                    System.out.println("CLOSING CHAT");
                    break;
                }

                buffer = new byte[1000];
            }

        } catch (IOException io) {
            System.err.println(io.getMessage());
        }
    }


    public static String data(byte[] buffer)

    {
        if (buffer == null){
            return null;
        }

        StringBuilder data = new StringBuilder();
        int i = 0;

        while (buffer[i] != 0) {
            data.append((char) buffer[i]);
            i++;
        }
        return data.toString();
    }
}


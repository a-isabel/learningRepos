package org.academiadecodigo.asciimos;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        final int port = 26465;
        Scanner read = null;

        try {

            read = new Scanner(System.in);

            DatagramSocket socket = new DatagramSocket();
            InetAddress ipAddress = InetAddress.getLocalHost();
            byte sendBuffer[];

            while (true) {

                String input = read.nextLine();
                sendBuffer = input.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, ipAddress, port);
                socket.send(sendPacket);

                if (input.equals("out"))
                    break;
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());

        } finally {

            if (read != null)
                read.close();
        }

    }
}

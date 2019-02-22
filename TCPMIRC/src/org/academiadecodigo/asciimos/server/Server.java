package org.academiadecodigo.asciimos.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    private final int port;
    private Socket client;

    public Server(int port) {
        this.port = port;
    }

    private void start() {

        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(port);

            while (true) {

                System.out.println("Waiting for a friend...");

                client = serverSocket.accept();
                System.out.println("New friend has arrived...");

                talkToClient();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (serverSocket != null) {
                    serverSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void talkToClient() throws IOException {

        Scanner fromKeyboardServer = new Scanner(System.in);
        BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter toClient = new PrintWriter(client.getOutputStream(), true);

        while (true) {

            String messageFromClient = fromClient.readLine();

            if (messageFromClient == null || messageFromClient.equalsIgnoreCase("/quit")) {
                System.out.println("Friend disconnected...");
                client.close();
                return;
            }

            System.out.print("My Friend: ");
            System.out.println(messageFromClient);
            System.out.print("Me :");
            String messageToClient = fromKeyboardServer.nextLine();
            toClient.println(messageToClient);

        }
    }


    public static void main(String[] args) {

        int port = 8080;
        Server server = new Server(port);
        server.start();

    }
}



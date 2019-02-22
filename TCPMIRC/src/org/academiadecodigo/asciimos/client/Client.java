package org.academiadecodigo.asciimos.client;

import java.io.*;
import java.net.Socket;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Client {

    public final String host;
    public final int port;
    private Socket socket;

    public Client(String host, int port) {
        this.host = host;
        this.port = port;
    }

    private void start() {
        try {

            socket = new Socket(host, port);
            System.out.println("Connection is established!");

            talk();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {

            close(socket);
        }
    }

    private void close(Closeable closeable) {

        try {
            if (closeable != null)
                socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void talk() throws IOException {

        Scanner fromKeyboard = new Scanner(System.in);
        PrintWriter toServer = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader fromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));


        while (true) {

            System.out.print("Ana Isabel: ");
            String message = fromKeyboard.nextLine();

            if (message.equalsIgnoreCase("/quit")) {

                System.out.println("Goodbye friend");
                return;
            }

            toServer.println(message);

            String messageFromServer = fromServer.readLine();
            System.out.println("Server: " + messageFromServer);

        }
    }

    public static void main(String[] args) {

        int port = 8080;
        String host = "localhost";

        Client client = new Client(host, port);
        client.start();

    }
}

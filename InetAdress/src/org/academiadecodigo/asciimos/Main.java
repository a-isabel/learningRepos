package org.academiadecodigo.asciimos;

import java.io.IOException;
import java.net.InetAddress;

public class Main {

    public static void main(String[] args) {

        final String host = "google.com";
        final int timeOut = 10000;

        try {
            InetAddress address = InetAddress.getByName(host);

            System.out.println("Host Name: " + host);
            System.out.println("IP Address: " + address.getHostAddress());
            System.out.println("Reachable: " + address.isReachable(timeOut));

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}

package org.academiadecodigo.asciimos;

public class WebServerLauncher {

    public static void main(String[] args) {


        int port = 21001;
        WebServer server = new WebServer(port);
        server.start();

    }

}

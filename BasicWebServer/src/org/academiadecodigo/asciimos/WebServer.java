package org.academiadecodigo.asciimos;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {

    private final int port;
    private Socket browser;

    static final File WEB_ROOT = new File("/Users/codecadet/Documents/Stuffs/unicorn.jpg");
    static final String DEFAULT_FILE = "index.html";
    static final String FILE_NOT_FOUND = "404.html";
    byte[] buffer;
    int num;

    public WebServer(int port) {
        this.port = port;
    }

    public void start() {

        ServerSocket serverSocket = null;

        try {

            serverSocket = new ServerSocket(port);

            while (true) {

                System.out.println("Waiting for request..");
                browser = serverSocket.accept();

                readFromBrowser();
                writeToBrowser();

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

    public void readFromBrowser() throws IOException {

        BufferedReader inputFromBrowser = new BufferedReader(new InputStreamReader(browser.getInputStream()));
        String requestFromBrowser = inputFromBrowser.readLine();
        System.out.println(requestFromBrowser);

    }

    public void writeToBrowser() throws IOException {

        FileInputStream fileInputStream = new FileInputStream("resources/index.html");
        DataOutputStream sendToBrowser = new DataOutputStream(browser.getOutputStream());

        int num = 0;
        byte[] buffer;

        sendToBrowser.writeBytes(header());

        while (num != -1) {
            buffer = new byte[1024];
            num = fileInputStream.read(buffer);
            if (num == -1) {
                break;
            }
           // System.out.println(num);
            sendToBrowser.write(buffer, 0, num);
        }

    }


    public String header(){

        String index = "HTTP/1.0 200 Document Follows\r\n" + "Content-Type: text/html; charset=UTF-8\r\n" +
                "Content-Length: 144 \r\n";

        return index;
    }


}


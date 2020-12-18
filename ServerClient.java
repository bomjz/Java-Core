package ru.geekbrains;
import java.io.IOException;
import java.net.Socket;

public class ServerClient {
    private final String ServerAdd = "localhost";
    private final int ServerPort = 8172;

    public ServerClient() {
        try {
            Socket sock = new Socket(ServerAdd, ServerPort);
            new Client(sock, "Клиент");
            while(true){
                if(sock.isClosed()){
                    break;
                }
            }
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ServerClient();
    }
}

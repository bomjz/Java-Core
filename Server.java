package ru.geekbrains;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Server {

    List<ClientHandler> clients = new ArrayList<>();
    Map<String, List<Message>> messages = new HashMap<>();

    Server() {
        try {
            ServerSocket serverSocket = new ServerSocket(8081);
            AuthService authService = new AuthService();
            // Обработчик клиентов
            while (true) {
                Socket socket = serverSocket.accept();
                new Thread(() -> {
                    new ClientHandler(authService, this, socket);
                }).start();
            }
        } catch (IOException e) {
            System.out.println("Сервер прекратил работу с ошибкой");
            e.printStackTrace();
        }
    }

    synchronized void onNewMessage(Client client, String message) {
       /* messages.add(new Message(client, message));
        // Рассылаем сообщения всем
        for (int i = 0; i < clients.size(); i++) {
            ClientHandler recipient = clients.get(i);
            if (!recipient.client.login.equals(client.login)) {
                recipient.sendMessage(client, message);
            }
        }*/
    }

    synchronized void messageName(Client sender, Client recipientLogin, String text){
        String senderLogin = sender.login;
        String key;
        if(senderLogin.compareTo(String.valueOf(recipientLogin)) > 0){
            key = senderLogin + recipientLogin;
        } else {
            key = recipientLogin + senderLogin;
        }
        if (!messages.containsKey(key)){
            messages.put(key, new ArrayList<>());
        }
        messages.get(key).add(new Message(sender, text));
        ClientHandler recipient = null;
        for (int i = 0; i < clients.size(); i++) {
            ClientHandler client = clients.get(i);
            if(client.client.login.equals((recipientLogin))){
                recipient = client;
            }
        }
        if(recipient != null){
            recipient.sendMessage(sender,text);
            System.out.println("Сообщение отправлено для " + recipientLogin);
        } else {
            System.out.println("Пользователь не найден" + recipientLogin);
        }
    }

    synchronized void onNewClient(ClientHandler clientHandler) {
        clients.add(clientHandler);
/*        for (int i = 0; i < messages.size(); i++) {
            Message message = messages.get(i);
            clientHandler.sendMessage(message.client, message.text);
        }*/
        onNewMessage(clientHandler.client, "Вошел в чат");
    }

    synchronized void onClientDisconnected(ClientHandler clientHandler) {
        clients.remove(clientHandler);
        onNewMessage(clientHandler.client, "Покинул чат");
    }

    public static void main(String[] args) {
        new Server();
    }

    private class AuthService {
    }
}
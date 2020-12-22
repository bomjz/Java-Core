package ru.geekbrains;

import java.util.ArrayList;
import java.util.List;

public class AuthServer {

    List<Client> clients = new ArrayList();

    AuthServer() {
        clients.add(new Client("Павел", "pavel1", "1234"));
        clients.add(new Client("Рома", "roma1", "1234"));
        clients.add(new Client("Гриша", "grisha1", "1234"));
    }

    synchronized Client checkAuth(String login, String password) {
        for (int i = 0; i < clients.size(); i++) {
            Client client = clients.get(i);
            if (client.login.equals(login) && client.password.equals(password)) {
                return client;
            }
            }
            return null;
        }
    }

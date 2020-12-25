package ru.geekbrains;

import java.util.ArrayList;
import java.util.List;

class AuthService {
    List<Client> clients = new ArrayList();

    AuthService() {
        clients.add(new Client("Семён", "sem1", "1234"));
        clients.add(new Client("Никита", "nikita1", "1234"));
        clients.add(new Client("Василий", "vas1", "4321"));
    }

    synchronized Client auth(String login, String password) {
        for (int i = 0; i < clients.size(); i++) {
            Client client = clients.get(i);
            if (client.login.equals(login) && client.password.equals(password)) {
                return client;
            }
        }
        return null;
    }
}

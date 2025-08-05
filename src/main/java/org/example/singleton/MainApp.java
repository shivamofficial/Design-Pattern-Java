package org.example.singleton;

public class MainApp {
    public static void main(String[] args) {
        UserService service = new UserService();

        service.processUser(101); // Existing user
        service.processUser(202); // Non-existing user
    }
}
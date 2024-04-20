package com.practice.app;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users = new ArrayList<>();

    public void addUser(String role, String username, String password, String email, String address) {
        User newUser = new User(role, username, password, email, address);
        users.add(newUser);
        System.out.println("The number of users are: " + users.size());
    }
}

package com.practice.app;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users;

    public UserManager() {
        this.users = new ArrayList<>();

    }

    public void addUser(String role, String username, String password, String email, String address) {
        User newUser = new User(role, username, password, email, address);
        UserValidator uv = new UserValidator(newUser);
        if (uv.isValid()) {
            users.add(newUser);
            System.out.println(users.size() + " user have joined TableReservation application");
        }
        else {
            System.out.println(users.size() + " Sorry user is not valid");

        }
    }
}

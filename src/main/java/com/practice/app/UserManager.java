package com.practice.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UserManager {
    private List<User> users;
    private HashSet<String> usernames;
    private HashSet<String> emails;

    public UserManager() {
        this.users = new ArrayList<>();
        this.usernames = new HashSet<>();
        this.emails = new HashSet<>();

    }

    public void addUser(String role, String username, String password, String email, String address) {
        User newUser = new User(role, username, password, email, address);
        UserValidator uv = new UserValidator(newUser);
        if (uv.isValid() && !usernames.contains(username) && !emails.contains(email)) {
            users.add(newUser);
            usernames.add(username);
            emails.add(email);
            System.out.println(users.size() + " user have joined TableReservation application");
        }
        else {
            System.out.println(users.size() + " Sorry user is not valid");
        }
    }
}

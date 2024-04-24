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

    public void addUser(User user) {
        UserValidator uv = new UserValidator(user);
        if (uv.isValid() && !usernames.contains(user.getUsername()) && !emails.contains(user.getEmail())) {
            users.add(user);
            usernames.add(user.getUsername());
            emails.add(user.getEmail());
            System.out.println("Welcome " + user.getUsername() + "! You are now a member of TableReservation. We now have " + users.size() + " users.");
        }
        else {
            System.out.println("Something went wrong for adding user.");
        }
    }
}

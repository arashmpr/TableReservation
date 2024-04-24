package com.practice.app;

import com.practice.app.exceptions.AddUserDuplicateUsernameError;

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

    public void addUser(User user) throws Exception{
        UserValidator uv = new UserValidator(user);
        if (uv.isValid() && !usernames.contains(user.getUsername()) && !emails.contains(user.getEmail())) {
            users.add(user);
            usernames.add(user.getUsername());
            emails.add(user.getEmail());
        }
        else {
            throw new AddUserDuplicateUsernameError();
        }
    }

    public List<User> getUsers() {
        return users;
    }
}

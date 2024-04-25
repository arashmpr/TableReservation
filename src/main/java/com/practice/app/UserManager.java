package com.practice.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserManager {
    private static final UserManager INSTANCE = new UserManager();
    private List<User> users;
    private HashSet<String> usernames;
    private HashSet<String> emails;

    private UserManager() {
        this.users = new ArrayList<>();
        this.usernames = new HashSet<>();
        this.emails = new HashSet<>();
    }

    public static UserManager getInstance() {
        return INSTANCE;
    }

    public void addUser(User user) throws Exception {
        UserValidator uv = new UserValidator(user);
        uv.validate(usernames, emails);

        users.add(user);
        usernames.add(user.getUsername());
        emails.add(user.getEmail());
    }

    public User getUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}

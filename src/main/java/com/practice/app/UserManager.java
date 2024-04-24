package com.practice.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Getter
@Setter
public class UserManager {
    private List<User> users;
    private HashSet<String> usernames;
    private HashSet<String> emails;

    public UserManager() {
        this.users = new ArrayList<>();
        this.usernames = new HashSet<>();
        this.emails = new HashSet<>();
    }

    public void addUser(User user) throws Exception {
        UserValidator uv = new UserValidator(user);
        uv.validate(usernames, emails);

        users.add(user);
        usernames.add(user.getUsername());
        emails.add(user.getEmail());
    }
}

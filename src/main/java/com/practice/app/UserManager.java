package com.practice.app;

import javax.xml.validation.Validator;
import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users = new ArrayList<>();

    public void addUser(String role, String username, String password, String email, String address) {
        User newUser = new User(role, username, password, email, address);
        boolean userValidation = validateUser(newUser);
        if (userValidation) {
            users.add(newUser);
            System.out.println(users.size() + " user have joined TableReservation application :)");
        }
        else {
            System.out.println(users.size() + " Sorry user is not valid :(");

        }

    }

    private boolean validateUser(User user) {
        boolean roleValidation = validateUserRole(user.getRole());
        boolean usernameValidation = validateUserUsername(user.getUsername());
        if (roleValidation && usernameValidation) {
            return true;
        }
        return false;
    }

    private boolean validateUserRole(String role) {
        if (role.equals("client") || role.equals("manager")) {
            return true;
        }
        System.out.println("User role has some fucked up stuff!");
        return false;
    }

    private boolean validateUserUsername(String username) {
        String regex = "^[^!@#$%^&*()+=\\[\\]{};:'\"\\\\|,.<>/?~`]+$";
        return username.matches(regex);
    }


}

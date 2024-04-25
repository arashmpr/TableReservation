package com.practice.app;

import com.practice.app.exceptions.*;

import java.util.HashSet;

public class UserValidator {
    private User user;

    public UserValidator(User user) {
        this.user = user;
    }

    public void validate(HashSet<String> usernames, HashSet<String> emails) throws Exception {
        validateRole();
        validateUsername();
        validateEmail();
        validateUserDoesNotExist(usernames);
        validateEmailDoesNotExist(emails);
    }

    private void validateRole() throws Exception {
        String role = user.getRole();
        if (!role.equals("client") && !role.equals("manager")) {
            throw new AddUserRoleIsInvalidError();
        }
    }

    private void validateUsername() throws Exception {
        String username = user.getUsername();
        String regex = "^[^!@#$%^&*()+=\\[\\]{};:'\"\\\\|,.<>/?~`]+$";
        if(!username.matches(regex)) {
            throw new AddUserUsernameFormatIsWrongError();
        }
    }

    private void validateEmail() throws Exception {
        String email = user.getEmail();
        String regexEmailPattern = "^(.+)@(\\S+)$";

        if (!email.matches(regexEmailPattern)) {
            throw new AddUserEmailFormatIsWrongError();
        }
    }

    private void validateUserDoesNotExist(HashSet<String> usernames) throws Exception {
        if(usernames.contains(user.getUsername())) {
            throw new AddUserDuplicateUsernameError();
        }
    }

    private void validateEmailDoesNotExist(HashSet<String> emails) throws Exception {
        if(emails.contains(user.getEmail())) {
            throw new AddUserDuplicateEmailError();
        }
    }
}

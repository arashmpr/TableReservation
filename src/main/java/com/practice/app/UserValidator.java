package com.practice.app;

public class UserValidator {
    private User user;

    private boolean isValid;

    private boolean isRoleValid;
    private boolean isUsernameValid;
    private boolean isEmailValid;
    private boolean isAddressValid;

    public UserValidator(User user) {
        this.user = user;
        this.isValid = false;
        this.isRoleValid = false;
        this.isUsernameValid = false;
        this.isEmailValid = false;
        this.isAddressValid = false;

        validate();

        if (isRoleValid && isUsernameValid && isEmailValid && isAddressValid) {
            isValid = true;
        } else {
            isValid = false;
        }
    }

    public boolean isValid() {
        return isValid;
    }

    private void validate() {
        validateRole();
        validateUsername();
        validateEmail();
        validateAddress();
    }

    private void validateRole() {
        String role = user.getRole();
        if (role.equals("client") || role.equals("manager")) {
            isRoleValid = true;
        }
    }

    private void validateUsername() {
        String username = user.getUsername();
        String regex = "^[^!@#$%^&*()+=\\[\\]{};:'\"\\\\|,.<>/?~`]+$";
        isUsernameValid =  username.matches(regex);
    }

    private void validateEmail() {
        String email = user.getEmail();
        String regexEmailPattern = "^(.+)@(\\S+)$";
        isEmailValid = email.matches(regexEmailPattern);
    }

    private void validateAddress() {
        String address = user.getAddress();
        if (address.contains("city") && address.contains("country")) {
            isAddressValid = true;
        }
    }
}

package com.practice.app;

public class TableReservation {
    private UserManager userManager = new UserManager();

    public void run() {
        this.userManager.addUser("client", "arash", "set12", "email", "address");
        System.out.println("The user is added to the thing!");
    }
}

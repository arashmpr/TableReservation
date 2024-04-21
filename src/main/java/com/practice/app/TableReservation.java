package com.practice.app;

public class TableReservation {
    private UserManager userManager = new UserManager();

    public void run() {
        this.userManager.addUser("manager", "ara2@sh", "set12", "email", "address");
        System.out.println("The user is added to the thing!");
    }
}

package com.practice.app;

public class CommandHandler {
    private String commandType;
    private UserManager userManager;


    public CommandHandler(String cmd, UserManager userManager) {
        this.userManager = userManager;

        parse(cmd);
    }

    public void process_command() {
        switch (commandType) {
            case "addUser":
                process_add_user();
                break;
            default:
                System.out.println("The command is unknown :( Please try again!");

        }
    }

    private void parse(String cmd) {
        commandType = cmd.split(" ")[1];
    }

    private void process_add_user() {
        userManager.addUser("manager", "arash", "1234", "ara", "city");
    }
}

package com.practice.app;

public class CommandHandler {
    private Context ctx;
    private String commandType;

    public CommandHandler(Context ctx, String cmd) {
        this.ctx = ctx;
        parse(cmd);
    }

    public void handle_command() {
        switch (commandType) {
            case "addUser":
                add_user_handler();
                break;
            default:
                System.out.println("The command is unknown :( Please try again!");

        }
    }

    private void parse(String cmd) {
        commandType = cmd.split(" ")[1];
    }

    private void add_user_handler() {
        this.ctx.getUserManager().addUser("client", "hamid", "1235", "arashmdp@gmail.com", "city iran and country fuck me");
    }
}

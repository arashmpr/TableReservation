package com.practice.app;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CommandHandler {
    private static final String SPACE=" ";
    private static final int COMMAND_IDX=0;
    private static final int JSON_DATA_IDX=1;
    private static final int MAX_ARGS_COUNT=2;
    private static Gson gson = new GsonBuilder().create();

    private Context ctx;
    private String commandType;
    private String jsonData;

    public CommandHandler(Context ctx, String cmd) {
        this.ctx = ctx;
        parse(cmd);
    }

    public void handle_command() {
        switch (commandType) {
            case "addUser":
                add_user_handler();
                break;
            case "addRestaurant":
                add_restaurant_handler();
                break;
            default:
                System.out.println("The command is unknown :( Please try again!");

        }
    }

    private void parse(String cmd) {

        commandType = cmd.split(SPACE, MAX_ARGS_COUNT)[0];
        jsonData = cmd.split(SPACE, MAX_ARGS_COUNT)[1];
    }

    private void add_user_handler() {
        User user = gson.fromJson(jsonData, User.class);
        this.ctx.getUserManager().addUser(user);
    }

    private void add_restaurant_handler() {
        this.ctx.getRestaurantManager().addRestaurant("", "", "", 0, 0, "", "");
    }
}

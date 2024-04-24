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
            case "addTable":
                add_table_handler();
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
        try {
            User user = gson.fromJson(jsonData, User.class);
            this.ctx.getUserManager().addUser(user);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void add_restaurant_handler() {
        Restaurant restaurant = gson.fromJson(jsonData, Restaurant.class);
        this.ctx.getRestaurantManager().addRestaurant(restaurant);
    }
    private void add_table_handler() {
        Table table = gson.fromJson(jsonData, Table.class);
        this.ctx.getTableManager().addTable(table);
        System.out.println("KOSSHER");
    }
}

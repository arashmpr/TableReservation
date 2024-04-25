package com.practice.app;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CommandHandler {
    private static final String SPACE=" ";

    private static final boolean SUCCESS_RES = true;
    private static final boolean FAILURE_RES = false;

    private static final String ADDUSER_SUCCESS_DATA = "User added successfully";
    private static final String ADDRESTAURANT_SUCCESS_DATA = "Restaurant added successfully";
    private static final String ADDTABLE_SUCCESS_DATA = "Table added successfully";

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

    public void handleCommand() {
        switch (commandType) {
            case "addUser":
                addUserHandler();
                break;
            case "addRestaurant":
                addRestaurantHandler();
                break;
            case "addTable":
                addTableHandler();
                break;
            default:
                System.out.println("The command is unknown :( Please try again!");

        }
    }

    private void parse(String cmd) {

        commandType = cmd.split(SPACE, MAX_ARGS_COUNT)[COMMAND_IDX];
        jsonData = cmd.split(SPACE, MAX_ARGS_COUNT)[JSON_DATA_IDX];
    }

    private void addUserHandler() {
        try {
            User user = gson.fromJson(jsonData, User.class);
            this.ctx.getUserManager().addUser(user);

            Response res = new Response(SUCCESS_RES, ADDUSER_SUCCESS_DATA);
            System.out.println(gson.toJson(res));
        } catch(Exception e) {
            Response res = new Response(FAILURE_RES, e.getMessage());
            System.out.println(gson.toJson(res));
        }
    }

    private void addRestaurantHandler() {
        try {
            Restaurant restaurant = gson.fromJson(jsonData, Restaurant.class);
            this.ctx.getRestaurantManager().addRestaurant(restaurant, ctx.getUserManager());

            Response res = new Response(SUCCESS_RES, ADDRESTAURANT_SUCCESS_DATA);
            System.out.println(gson.toJson(res));
        } catch(Exception e) {
            Response res = new Response(FAILURE_RES, e.getMessage());
            System.out.println(gson.toJson(res));
        }
    }
    private void addTableHandler() {
        try {
            Table table = gson.fromJson(jsonData, Table.class);
            this.ctx.getTableManager().addTable(table);

            Response res = new Response(SUCCESS_RES, ADDTABLE_SUCCESS_DATA);
            System.out.println(gson.toJson(res));
        } catch(Exception e) {
            Response res = new Response(FAILURE_RES, e.getMessage());
            System.out.println(gson.toJson(res));
        }
    }
}

package com.practice.app;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.practice.app.Managers.RestaurantManager;
import com.practice.app.Managers.TableManager;
import com.practice.app.Managers.UserManager;
import com.practice.app.Models.Response;
import com.practice.app.Models.Restaurant;
import com.practice.app.Models.Table;
import com.practice.app.Models.User;

import static com.practice.app.Commons.Response.FAILURE_RES;
import static com.practice.app.Commons.Response.SUCCESS_RES;
import static com.practice.app.Commons.RestaurantResponse.ADDRESTAURANT_SUCCESS_DATA;
import static com.practice.app.Commons.TableResponse.ADDTABLE_SUCCESS_DATA;
import static com.practice.app.Commons.UserResponse.ADDUSER_SUCCESS_DATA;

public class CommandHandler {
    private static final String SPACE=" ";
    private static final int COMMAND_IDX=0;
    private static final int JSON_DATA_IDX=1;
    private static final int MAX_ARGS_COUNT=2;
    private static final Gson gson = new GsonBuilder().create();
    private String commandType;
    private String jsonData;
    private final UserManager userManager;
    private final RestaurantManager restaurantManager;
    private final TableManager tableManager;

    public CommandHandler(String cmd) {
        this.userManager = UserManager.getInstance();
        this.restaurantManager = RestaurantManager.getInstance();
        this.tableManager = TableManager.getInstance();
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
            userManager.addUser(user);

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
            restaurantManager.addRestaurant(restaurant);

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
            tableManager.addTable(table);

            Response res = new Response(SUCCESS_RES, ADDTABLE_SUCCESS_DATA);
            System.out.println(gson.toJson(res));
        } catch(Exception e) {
            Response res = new Response(FAILURE_RES, e.getMessage());
            System.out.println(gson.toJson(res));
        }
    }
}

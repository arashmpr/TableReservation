package com.practice.app;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Context {
    private UserManager userManager;
    private RestaurantManager restaurantManager;
    private TableManager tableManager;
    public Context() {
        this.userManager = new UserManager();
        this.restaurantManager = new RestaurantManager();
        this.tableManager = new TableManager();
    }

}

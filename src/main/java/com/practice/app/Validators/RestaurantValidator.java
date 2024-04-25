package com.practice.app.Validators;

import com.practice.app.Exceptions.RestaurantExceptions.*;
import com.practice.app.Managers.RestaurantManager;
import com.practice.app.Managers.UserManager;
import com.practice.app.Models.Restaurant;
import com.practice.app.Models.User;

public class RestaurantValidator {
    private static final String MANAGER_ROLE="manager";
    private static final String COLON=":";
    private static final int HH_IDX=0;
    private static final int MM_IDX=1;
    private Restaurant restaurant;
    private RestaurantManager restaurantManager;
    private UserManager userManager;

    public RestaurantValidator(Restaurant restaurant) {
        this.restaurant = restaurant;
        this.restaurantManager = RestaurantManager.getInstance();
        this.userManager = UserManager.getInstance();
    }

    public void validate() throws Exception{
        validateNameDoesNotExist();
        validateUserManagerExists();
        validateUserManagerRoleIsValid();
        validateTimeFormat(restaurant.getStartTime());
        validateTimeFormat(restaurant.getEndTime());
        validateAddress();
    }

    private void validateNameDoesNotExist() throws Exception {
        if (restaurantManager.getNames().contains(restaurant.getName())) {
            throw new AddRestaurantDuplicateNameError();
        }
    }

    private void validateUserManagerExists() throws Exception {
        if (!userManager.getUsernames().contains(restaurant.getManagerUsername())) {
            throw new AddRestaurantUserManagerDoesNotExistError();
        }
    }

    private void validateUserManagerRoleIsValid() throws Exception {
        User user = userManager.getUserByUsername(restaurant.getManagerUsername());

        if (!user.getRole().equals(MANAGER_ROLE)) {
            throw new AddRestaurantUserManagerRoleIsWrongError();
        }
    }

    private void validateTimeFormat(String time) throws Exception {
        if (!time.contains(COLON)) {
            throw new AddRestaurantTimeFormatIsInvalidError();
        }

        String hh = time.split(COLON)[HH_IDX];
        String mm = time.split(COLON)[MM_IDX];
        String regexHHPattern = "^(0[0-9]|1[0-9]|2[0-4])$";

        if (!mm.equals("00") || !hh.matches(regexHHPattern)) {
            throw new AddRestaurantTimeFormatIsInvalidError();
        }
    }

    private void validateAddress() throws Exception {
        if (restaurant.getAddress().getStreet() == null || restaurant.getAddress().getStreet().isEmpty()) {
            throw new AddRestaurantAddressHasNoStreetError();
        }
        if (restaurant.getAddress().getCity() == null || restaurant.getAddress().getCity().isEmpty()) {
            throw new AddRestaurantAddressHasNoCityError();
        }
        if (restaurant.getAddress().getCountry() == null || restaurant.getAddress().getCountry().isEmpty()) {
            throw new AddRestaurantAddressHasNoCountryError();
        }
    }
}

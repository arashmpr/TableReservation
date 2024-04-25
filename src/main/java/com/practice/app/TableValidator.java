package com.practice.app;

import com.practice.app.exceptions.AddTableDuplicateTableNumberError;

public class TableValidator {
    private Table table;
    private TableManager tableManager;
    private RestaurantManager restaurantManager;

    public TableValidator(Table table) {
        this.table = table;
        this.tableManager = TableManager.getInstance();
        this.restaurantManager = RestaurantManager.getInstance();
    }

    public void validate() throws Exception{
        validateTableNumberDoesNotExist();
    }

    private void validateTableNumberDoesNotExist() throws Exception {
        if (tableManager.getTablesNumber().contains(table.getTableNumber())) {
            throw new AddTableDuplicateTableNumberError();
        }
    }

}

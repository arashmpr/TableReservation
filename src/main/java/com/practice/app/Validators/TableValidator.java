package com.practice.app.Validators;

import com.practice.app.Exceptions.TableExceptions.AddTableDuplicateTableNumberError;
import com.practice.app.Managers.RestaurantManager;
import com.practice.app.Managers.TableManager;
import com.practice.app.Models.Table;

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

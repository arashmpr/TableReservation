package com.practice.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TableManager {
    private static final TableManager INSTANCE = new TableManager();
    List<Table> tables;
    HashSet<Integer> tablesNumber;
    private TableManager(){
        this.tables = new ArrayList<>();
        this.tablesNumber = new HashSet<>();
    }
    public static TableManager getInstance() {
        return INSTANCE;
    }
    public void addTable(Table table) throws Exception{
        TableValidator tv = new TableValidator(table);
        tv.validate();

        tables.add(table);
        tablesNumber.add(table.getTableNumber());
    }

    public HashSet<Integer> getTablesNumber() {
        return this.tablesNumber;
    }
}

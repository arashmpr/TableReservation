package com.practice.app;

import java.util.ArrayList;
import java.util.List;

public class TableManager {
    private static final TableManager INSTANCE = new TableManager();
    List<Table> tables;
    private TableManager(){
        this.tables=new ArrayList<>();
    }
    public static TableManager getInstance() {
        return INSTANCE;
    }
    public void addTable(Table table){
        tables.add(table);
    }
}

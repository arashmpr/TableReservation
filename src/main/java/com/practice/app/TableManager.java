package com.practice.app;

import java.util.ArrayList;
import java.util.List;

public class TableManager {
    List<Table> tables;
    public TableManager(){
        this.tables=new ArrayList<>();
    }
    public void addTable(Table table){
        tables.add(table);
    }
}

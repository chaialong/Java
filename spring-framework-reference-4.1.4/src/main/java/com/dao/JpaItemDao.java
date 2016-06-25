package com.dao;

public class JpaItemDao {
    public JpaItemDao() {
    }

    public JpaItemDao(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    private String itemName;
}

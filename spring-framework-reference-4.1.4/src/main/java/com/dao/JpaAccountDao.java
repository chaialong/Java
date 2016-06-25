package com.dao;

public class JpaAccountDao {
    public JpaAccountDao() {
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    private String accountName;

}
